package com.tomorrow.demo5;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("狗子",18);
        System.out.println(d.getName() + " " + d.getAge());
        d.eat();
        d.swim();
    }
}
