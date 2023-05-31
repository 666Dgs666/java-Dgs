package com.tomorrow.demo7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        try {
//            Scanner sc=new Scanner(System.in);
//            int a=sc.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("输入格式有误,请输入数字");
//        }
//        System.out.println("程序结束");

        try {
            String s1=new String("abc");
            int i=Integer.parseInt(s1);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("程序执行结束");



    }

}
