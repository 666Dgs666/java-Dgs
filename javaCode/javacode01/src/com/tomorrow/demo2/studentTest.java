package com.tomorrow.demo2;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {
        Student stu1=new Student("zhangsan",23);
        Student stu2=new Student("lisi",24);
        Student stu3=new Student("senge",18);
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int maxAge = getMaxAgeToll.getMaxAge(list);
        System.out.println(maxAge);

    }
}
