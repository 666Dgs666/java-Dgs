package studentsystem.test_03;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        int smallCount=0;
        int bigCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if('a'<=c&&c<='z'){
                smallCount++;
            }
            else if('A'<=c&&c<='Z'){
                bigCount++;
            }
            else if('0'<=c&&c<='9'){
                numberCount++;
            }
        }
        System.out.println("小写字母有:"+smallCount+"个");
        System.out.println("大写字母有:"+bigCount+"个");
        System.out.println("数字有:"+numberCount+"个");
    }
}
