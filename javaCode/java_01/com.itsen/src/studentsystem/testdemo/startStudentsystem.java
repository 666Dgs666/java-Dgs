package studentsystem.testdemo;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class startStudentsystem {
    public static void main(String[] args) {
        ArrayList<User> List=new ArrayList<>();
        System.out.println("欢迎来到学生管理系统登录界面");
        System.out.println("请选择操作1.登录 2.注册 3.忘记密码");
        Scanner sc=new Scanner(System.in);
        //选择123
        while (true) {
            System.out.println("请输入你的选择:");
            String choose=sc.next();
            switch(choose)
            {
                case "1":
                {
                    Log(List);
                    break;
                }
                case "2": {
                    register(List);
                    break;
                }
                case "3":
                {
                    forgetPassward(List);
                    break;
                }
                default:
                    System.out.println("没有该选项,请重新输入你的选择");

            }
        }
    }
    //登录
    public static void Log(ArrayList<User> List)
    {
        if(List.size()==0)
        {
            System.out.println("用户名未注册,请先注册");
            return;
        }
        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String userName=sc.next();
            System.out.println("请输入密码:");
            String passward=sc.next();
            while (true) {
                String vc=outVc();
                System.out.println("验证码:"+vc);
                System.out.println("请输入验证码:");
                String vc02=sc.next();
                if(vc.equals(vc02))
                {
                    break;
                }
                else
                {
                    System.out.println("验证码输入有误,请重新输入验证码:");
                }
            }
            User u=new User(userName,passward,null,null);
            boolean flag=checkInfor(List,u);
            if(flag){
                System.out.println("登录成功");
                StudentControlDemo ss=new StudentControlDemo();
                ss.startStudentSystem();
                return ;
            }
            else
            {
                System.out.println("用户名或密码错误,请重新输入,你还剩"+(2-i)+"次机会");
            }
           /* if(checkLogName(List,userName))
            {
                if(checkLogPassward(List,passward))
                {
                    System.out.println("用户登录成功");
                    return;
                }

            }
            else
            {
                System.out.println("用户名或密码输入有误,请重新输入,你还剩"+(2-i)+"次机会");
            }*/
        }

        }

    //注册
    public static void register(ArrayList<User> List)
    {
        User u=new User();
        boolean flag;
        Scanner sc=new Scanner(System.in);
        //输入用户名,并对其进行验证
        while (true) {
            System.out.println("请输入用户名:");
            String useName=sc.next();
            flag=checkUseName(List,useName);
            if(flag){
                u.setName(useName);
                System.out.println("用户名录入成功");
                break;
            }
            else
            {
                System.out.println("用户名已存在或者用户名不符合要求,请输入新的用户名");
            }
        }

        //输入身份证号码,并对其进行验证
        while (true) {
            System.out.println("请输入18位身份证号码");
            String idNumber=sc.next();
            flag=checkIdNumber(List,idNumber);
            if(flag)
            {
                u.setId(idNumber);
                System.out.println("身份证号码录入成功");
                break;
            }
            else{
                System.out.println("身份证号码不符合规范,请重新输入");
            }
        }
        //输入手机号,并对其进行验证
        while (true) {
            System.out.println("请输入你的手机号码:");
            String phoneNumber=sc.next();
            flag=checkPhoneNumber(phoneNumber);
            if(flag){
                u.setPhoneNumber(phoneNumber);
                System.out.println("手机号码录入成功");
                break;
            }
            else{
                System.out.println("手机号码不符合要求,请重新输入");
            }
        }
        //输入密码
        while (true) {
            System.out.println("请输入密码");
            String passward=sc.next();
            System.out.println("请再次确认密码");
            String passward2=sc.next();
            if(passward.equals(passward2))
            {
                u.setPassward(passward);
                System.out.println("密码录入成功");
                break;
            }
            else{
                System.out.println("两次密码不一致,请重新录入");
            }
        }

        List.add(u);
        System.out.println("该用户注册成功");

    }

    //忘记密码
    public static void forgetPassward(ArrayList<User> List)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName=sc.next();
        int index=containsUserNmae(List,userName);
        if(index>=0){
            System.out.println("请输入用户身份证号码");
            String idNumber=sc.next();
            System.out.println("请输入用户手机号码");
            String phoneNumber=sc.next();
            User u=new User(userName,null,idNumber,phoneNumber);
            boolean flag2=containsUser(List,u);
            if(flag2){
                while (true) {
                    System.out.println("请输入密码,进行修改");
                    String newPassword=sc.next();
                    System.out.println("请再次确认密码:");
                    String newPsssword02=sc.next();
                    if(newPassword.equals(newPsssword02)){
                        List.get(index).setPassward(newPassword);
                        System.out.println("密码修改成功");
                        return ;
                    }
                    else{
                        System.out.println("两次密码输入不一致,请重新输入");
                    }
                }

            }
            else
            {
                System.out.println("账户信息不匹配,修改失败");
                return ;
            }

        }
        else{
            System.out.println(userName+"未注册");
            return ;
        }
    }

    //检查用户名正确性
    public static boolean checkUseName(ArrayList<User> List,String useName)
    {
        boolean flag=true;
        if(List.size()!=0)
        {
            for (int i = 0; i < List.size(); i++) {
                User u=List.get(i);
                if(u.getName().equals(useName))
                {
                    return false;
                }
            }
        }

            if(useName.length()>15||useName.length()<3)
            {
                return false;
            }
            for (int i = 0; i < useName.length(); i++) {
                char c=useName.charAt(i);
                if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')||('0'<=c&&c<='9'))
                {
                    if(('a'<=c&&c<='z')||('A'<=c&&c<='Z'))
                    {
                        break;
                    }
                }
                else{
                    return false;
                }

            }

        return flag;
    }
    //检查用户身份证号码正确性
    public static boolean checkIdNumber(ArrayList<User> List,String userId)
    {
        if(userId.length()!=18)
        {
            return false;
        }
        if(userId.charAt(0)=='0')
        {
            return false;
        }
        for (int i = 0; i < 16; i++) {
            char c=userId.charAt(0);
            if(c<'0'||c>'9')
            {
                return false;
            }
        }
        char h=userId.charAt(17);
        if(h=='x'||h=='X'||(h>='0'&&h<='9'))
        {
            return true;
        }
        else
        {
            return false;
        }



    }
    //检查用户手机号码的正确性
    public static boolean checkPhoneNumber(String phoneNumber)
    {
        if(phoneNumber.length()!=11){
            return false;
        }
        char h=phoneNumber.charAt(0);
        if(h=='0')
        {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c=phoneNumber.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
    //生成验证码
    public static String outVc(){
        ArrayList<Character> list=new ArrayList<>();
        Random rc=new Random();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index=rc.nextInt(list.size());
            char c=list.get(index);
            sb.append(c);
        }
        sb.append(rc.nextInt(10));
        char[] arr=sb.toString().toCharArray();
        int index=rc.nextInt(arr.length);
        char tem=arr[index];
        arr[index]=arr[arr.length-1];
        arr[arr.length-1]=tem;
        return new String(arr);
    }
    //登录时检查用户名和密码
    private static boolean checkInfor(ArrayList<User> list, User u) {
        for (int i = 0; i < list.size(); i++) {
            User u2=list.get(i);
            if(u.getName().equals(u2.getName())&&u.getPassward().equals(u2.getPassward()))
                {
                return true;
            }
        }
        return false;
    }
   /* public static boolean checkLogName(ArrayList<User> List,String userName){
        for (int i = 0; i < List.size(); i++) {
            User u=List.get(i);
            if(userName.equals(u.getName())){
                return true;
            }
        }
        return false;
    }
    //登录时检查密码
    public static boolean checkLogPassward(ArrayList<User> List,String passward){
        for (int i = 0; i < List.size(); i++) {
            User u=List.get(i);
             if(u.getPassward().equals(passward)){
                return true;
            }
        }
        return false;
    }
   */
   //检查用户名是否已经注册
   private static int  containsUserNmae(ArrayList<User> list, String userName) {
       for (int i = 0; i < list.size(); i++) {
           User u=list.get(i);
           if(u.getName().equals(userName))
           {
               return i;
           }
       }
       return -1;
   }
   //忘记密码中检查用户是否已经存在
   private static boolean containsUser(ArrayList<User> list, User u) {
       for (int i = 0; i < list.size(); i++) {
           User u2=list.get(i);
           if(u.getName().equals(u2.getName())&&u.getId().equals(u2.getId())&&u.getPhoneNumber().equals(u2.getPhoneNumber()));
           return true;
       }
       return false;
   }


}
