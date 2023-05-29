package demotest_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoTest_01 {
    public static void main(String[] args) {

    }




   /* public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            
        }

    }
*/







    /*public static void main(String[] args) {
        for(int i=101;i<=200;i++){
            if(is_prime(i)==1){
                System.out.println(i);
            }
        }

    }
   public static int is_prime(int i){
            int flag=1;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
        return flag;
    }
*/







   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始票价:");
        int ticket = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请选择座位等次:");
        int seat = sc.nextInt();
        getTicket(ticket, month, seat);
    }

    public static void getTicket(int ticket, int month, int seat) {
        if (5 <= month && month <= 10) {
            if (seat == 0) {
                ticket = (int) (ticket * 0.9);
            } else if (seat == 1) {
                ticket=(int)(ticket*0.85);
            }
        }
        else if((1<=month&&month<=4)||(11<=month&&month<=12)){
            if (seat == 0) {
                ticket = (int) (ticket * 0.7);
            } else if (seat == 1) {
                ticket=(int)(ticket*0.65);
            }
        }
    }*/
}