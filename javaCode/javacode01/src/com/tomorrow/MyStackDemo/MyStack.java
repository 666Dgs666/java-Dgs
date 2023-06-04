package com.tomorrow.MyStackDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<T> {
    //创建一个集合用于存储元素
    ArrayList<T> myStack=new ArrayList<>();

    //入栈（方法名：push）
    public void push(T obj)
    {
        myStack.add(obj);
    }
    //出栈（方法名：pop）
    public void pop()
    {
        myStack.remove(myStack.size()-1);
    }

    //返回栈顶元素（方法名：top）
    public Object top()
    {
        if(myStack.isEmpty())
        {
            System.out.println("栈为空");
            return 0;
        }
        else
        {
            Object res;
            res= myStack.get(myStack.size()-1);
            return res;
        }
    }

    //手写栈内部元素展示
    public void MyStackShow()
    {
        Iterator<T> stackIterator=myStack.iterator();
        while(stackIterator.hasNext())
        {
            T next = stackIterator.next();
            System.out.println(next);

        }
    }




}
