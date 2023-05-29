package studentsystem.test_03;

import java.util.ArrayList;

public class TestDemo4 {

    public static void main(String[] args) {
        ArrayList<Phone> List=new ArrayList<>();
        Phone p1=new Phone("苹果",3999);
        Phone p2=new Phone("小米",1999);
        Phone p3=new Phone("锤子",2999);
        List.add(p1);
        List.add(p2);
        List.add(p3);
        ArrayList<Phone> PhoneInfoList = getPhoneInfo(List);
        for (int i = 0; i < PhoneInfoList.size(); i++) {
            Phone ph=PhoneInfoList.get(i);
            System.out.println(ph.getBrand()+", "+ph.getPrice());
        }
    }
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> List){
        ArrayList<Phone> resultList=new ArrayList<>();

        for (int i = 0; i < List.size(); i++) {
            Phone pho=List.get(i);
            if(pho.getPrice()<3000)
            {
                resultList.add(pho);
            }
        }
        return resultList;
    }

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<User> List=new ArrayList<>();
        User u1=new User("001","zhangsan","123456");
        User u2=new User("002","lishi","1234567");
        User u3=new User("003","wangwu","1234568");
        List.add(u1);
        List.add(u2);
        List.add(u3);
        System.out.println("请输入需要查询用户的id:");
        String id=sc.next();
        boolean flag = contain(List, id);
        System.out.println(flag);
        if(flag==false)
        {
            System.out.println("查找不到该用户");
        }
        else
        {
            int index=getIndex(List,id);
            User u=List.get(index);
            System.out.println("用户的信息为:");
            System.out.println(u.getId()+", "+u.getUserName()+", "+u.getPassward());
        }

    }

    public static boolean contain(ArrayList<User> List,String id){
        return getIndex(List,id)>=0;
    }
    public static int getIndex(ArrayList<User> List,String id){
        for (int i = 0; i < List.size(); i++) {
            if(List.get(i).getId().equals(id))
            {
                return i;
            }
        }
        return -1;
    }

*/


    /*public static void main(String[] args) {
        ArrayList<Student> List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student std=new Student();
            System.out.println("请输入学生姓名:");
            String name=sc.next();
            System.out.println("请输入学生年龄:");
            int age=sc.nextInt();
            std.setName(name);
            std.setAge(age);
            List.add(std);
        }
        for (int i = 0; i < List.size(); i++) {
            Student stu=List.get(i);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }*/


    /*public static void main(String[] args) {
        ArrayList<Student> List=new ArrayList<>();
        Student s1=new Student("zhangsan",15);
        Student s2=new Student("lisi",14);
        Student s3=new Student("wangwu",13);
        List.add(s1);
        List.add(s2);
        List.add(s3);
        for (int i = 0; i < List.size(); i++) {
            Student stu=List.get(i);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }*/
}
