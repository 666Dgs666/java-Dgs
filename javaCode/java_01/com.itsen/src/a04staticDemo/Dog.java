package a04staticDemo;

import java.util.zip.CheckedOutputStream;

public class Dog extends Animal{

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的狗正抱着"+something+"吃");
    }
    public void lookHome()
    {
        System.out.println("狗在看家");
    }
}
