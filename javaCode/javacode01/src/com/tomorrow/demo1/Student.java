package com.tomorrow.demo1;

public class Student {
    private static String name;
    private int age;
    public static String teacherName;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void study()
    {

        System.out.println(name + "正在学习");
    }
    public void show()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println("老师是"+teacherName);

    }


}
