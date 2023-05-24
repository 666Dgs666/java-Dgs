package com.tomorrow.demo4;

public class Test {
    public static void main(String[] args) {
        animal a=new Dog();
        if(a instanceof Cat)
        {
            Dog d=(Dog)a;
            d.work();
        }
        else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.work();
        }
        else
        {
            System.out.println("强转不成功");
        }

    }
}

class animal{
    public String name;
    public int age;
    public void eat()
    {
        System.out.println("动物在吃东西");
    }

}

class Dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
    public void work()
    {
        System.out.println("狗在看家");
    }

}
class Cat extends animal{
    @Override
    public void eat() {
        System.out.println("猫在吃小鱼干");
    }
    public void work()
    {
        System.out.println("猫在抓老鼠");
    }

}
