package com.tomorrow.demo7;


public class FinallyTest {
    public static void main(String[] args) {
        int res= test("aa");
        System.out.println(res);
    }

    public static int test(String s){

        try {
            Integer.parseInt(s);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("程序结束");
            return 0;//最后的返回值会强制是finally的返回值
        }

    }


}
