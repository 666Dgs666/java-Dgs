package com.tomorrow.demo8;

import com.tomorrow.demo09.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    //Collection接口中的方法的测试
    @Test
    public void test()
    {
        //add方法
        Collection c=new ArrayList();
        c.add("666");
        c.add(123);
        c.add(new Person("老六",18));
        System.out.println(c);
        //addAll方法
        Collection c1=new ArrayList();
        c1.add("喝喝喝");
        c1.add(1651);
        c.addAll(c1);//用addAll方法相当于将从c1 中的每一个元素都放入c集合中
        System.out.println(c);
        c.add(c1);//将C1集合看成一个整体加入c
        System.out.println(c);
    }
}
