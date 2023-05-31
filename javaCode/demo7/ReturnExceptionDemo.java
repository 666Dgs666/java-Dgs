package com.tomorrow.demo7;

public class ReturnExceptionDemo  {

    static void methodA() throws Exception
    {
        try {
            System.out.println("进入methodA");
            throw new Exception("制造异常");
        }finally {
            System.out.println("执行methodA的finally");

        }

    }

    public static void main(String[] args) {

        try {
            methodA();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
