package com.demo_01;

public class student {
    String name;
    private int age;
    public student(){
//        System.out.println("无参构造方法吧");
    }
    public student(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void setAge(int a){
        if(a<0||a>120){
            System.out.println("你输入的年龄不符合实际");
        }
        else{
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
