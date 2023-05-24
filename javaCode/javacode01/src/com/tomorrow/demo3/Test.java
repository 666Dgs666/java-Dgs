package com.tomorrow.demo3;

public class Test {
    public static void main(String[] args) {
        Manager m=new Manager("01","zhangshan",8000,2000);
        Cook c=new Cook("002","xiaoli",5000);
        System.out.println(m.getName()+" "+m.getId()+" "+m.getMoney()+" "+m.getBonus());
        m.work();
        m.eat();

        System.out.println(c.getName()+" "+c.getId()+" "+c.getMoney());
        c.work();
        m.eat();

    }
}
