package com.tomorrow.demo5;

public class Dog extends Animal implements swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗子吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
