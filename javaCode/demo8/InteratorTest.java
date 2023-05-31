package com.tomorrow.demo8;

import com.tomorrow.demo09.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InteratorTest {

//    @Test
//    public void test2()
//    {
//        Collection c=new ArrayList();
//        c.add("666");
//        c.add(123);
//        c.add(new Person("老六",18));
////        //获取迭代器
//////        Iterator iterator = c.iterator();
//////        //遍历集合
//////        while(iterator.hasNext())
//////        {
//////            System.out.println(iterator.next());
//////        }
//        for(Object obj :c)//内部分别为,对象类型 形式变量名 :需要遍历的集合或者数组名
//        {
//            System.out.println(obj);
//        }
    @Test
    public void tes1()
    {
        List list=new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(new Person("牛批",18));
        System.out.println(list);
        list.add(1,"xiu");
        System.out.println(list);
        list.set(1,"wudi");
        System.out.println(list);

    }

}
