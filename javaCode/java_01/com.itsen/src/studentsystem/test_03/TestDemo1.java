package studentsystem.test_03;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字字符串:");
            String str1=sc.nextLine();
            boolean flag=checkStr(str1);
            if(flag)
            {

                StringBuilder sb=new StringBuilder();
                for (int i = 0; i < str1.length(); i++) {
                    char c2=str1.charAt(i);
                    int number=c2-'0';
                    int length=str1.length();
                    sb.append(toLuoMa(number,length));
                }
                sb.toString();
                System.out.println(sb);
                break;

            }
            else{
                System.out.println("你输入的字符串有误,请重新输入:");
            }
        }
    }

    public static String toLuoMa(int number,int length)
    {
        String[] LuoMa={"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅸ"};
        return LuoMa[number-1];
    }


    public static boolean checkStr(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}


