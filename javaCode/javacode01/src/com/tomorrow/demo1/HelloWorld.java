package com.tomorrow.demo1;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//        String s=sc.next();
//        System.out.println(s)；
//        String phoneNumber="151555555";
//        String start=phoneNumber.substring(0,3);
//        System.out.println(start);
//        String end=phoneNumber.substring(3);
//        System.out.println(end);
//        String append=start+end;
//        System.out.println(append);
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbbb");
        list.add("ccc");
        System.out.println(list);
        boolean res1=list.remove("aaa");
        String s1=list.remove(0);
        System.out.println(res1);
        System.out.println(s1);
        list.set(0,"dddddd");
        System.out.println(list);
        list.add("66666");
        System.out.println(list.get(1));
    }
}
