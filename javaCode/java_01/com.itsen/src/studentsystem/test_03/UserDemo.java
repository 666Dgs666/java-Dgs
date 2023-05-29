package studentsystem.test_03;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        String rightUesrName="senge";
        String rightPassward="123456";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName=sc.next();
            System.out.println("请输入用户密码:");
            String passward=sc.next();
            if(userName.equals(rightUesrName)&&passward.equals(rightPassward)){
                System.out.println("用户登录成功");
                break;
            }
            else{
                if(i==2){
                    System.out.println("你的账户"+rightUesrName+"已经被冻结"+","+"请联系客服小姐姐");
                }
                else{
                    System.out.println("你还剩"+(2-i)+"次机会");
                }

            }
        }

    }
}
