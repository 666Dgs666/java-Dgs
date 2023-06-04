package com.tomorrow.MyStackDemo;

import java.util.Scanner;

public class MyStackMain {
    public static void main(String[] args) {
        System.out.println("---手写栈---");
        Operation.Operate();
    }
}

class Operation
{
    //创建对象
    public static void Operate()
    {
        MyStack<Integer> myStack=new MyStack<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {

            System.out.println("请输入你的选择");
            System.out.println("1--加载元素进栈  2--出栈  3--返回栈顶元素 4--遍历所有元素");
            int op=sc.nextInt();
            if(op==1)
            {
                System.out.println("请输入元素");
                int in=sc.nextInt();
                myStack.push(in);
//                myStack.MyStackShow();
            }
            else if(op==2)
            {
                myStack.pop();
            }
            else if(op==3)
            {
                Object top = myStack.top();
                System.out.println(top);
            }
            else if(op==4)
            {
                myStack.MyStackShow();
            }
            else
            {
                System.out.println("输入数字有误,请重新输入");
            }
        }
    }

}
