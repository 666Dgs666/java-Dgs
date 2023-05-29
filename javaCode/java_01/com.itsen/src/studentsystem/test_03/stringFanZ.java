package studentsystem.test_03;

import java.util.Scanner;

public class stringFanZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.next();
        String str2=strFanZ(str1);
        System.out.println(str2);

    }
    public static String strFanZ(String str1){
        String str="";
        for (int i = 0; i < str1.length(); i++) {
            char c=str1.charAt(str1.length()-i-1);
            str=str+c;
        }
        return str;
    }
}
