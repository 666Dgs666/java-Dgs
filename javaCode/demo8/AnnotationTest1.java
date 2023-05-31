package com.tomorrow.demo8;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest1 {
    @Test
    public void praseClass() throws Exception {
//        //1.先获取类上的对象
//        Class c=Demo.class;
//        //2.解析类上的注解
//        //判断注解是否存在
//        if(c.isAnnotationPresent(MyTest.class))
//        {
//            //获取指定的对象注解
//            MyTest  myTest= (MyTest) c.getDeclaredAnnotation(MyTest.class);
//            //打印注解内容
//            System.out.println(myTest.value());
//            System.out.println(myTest.aaa());
//            System.out.println(Arrays.toString(myTest.bbb()));
//
//        }
        //1.先获取类上的对象
        Class c=Demo.class;
        Method m=c.getDeclaredMethod("test");
        //2.解析类上的注解
        //判断注解是否存在
        if(m.isAnnotationPresent(MyTest.class))
        {
            //获取指定的对象注解
            MyTest  myTest= (MyTest) m.getDeclaredAnnotation(MyTest.class);
            //打印注解内容
            System.out.println(myTest.value());
            System.out.println(myTest.aaa());
            System.out.println(Arrays.toString(myTest.bbb()));

        }
    }


}
