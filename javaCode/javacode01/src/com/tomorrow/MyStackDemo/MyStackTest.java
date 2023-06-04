package com.tomorrow.MyStackDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class MyStackTest {


    //创建stack对象
    MyStack<Integer> myStack;
    @Before
    public void init()
    {
        this.myStack=new MyStack<>();
        myStack.push(11);
        myStack.push(22);
        myStack.push(33);
    }
    @After
    public void close()
    {
        this.myStack=null;
    }

    @Test
    //加入元素方法测试
    public void PushTest()
    {
        myStack.push(22);
        myStack.MyStackShow();
    }
    //出栈操作
    @Test
    public void PopTest()
    {
        myStack.pop();
        myStack.MyStackShow();
    }

    //测试返回栈顶元素
    @Test
    public void TopTest()
    {
        Object top = myStack.top();
        System.out.println(top);
    }







}
