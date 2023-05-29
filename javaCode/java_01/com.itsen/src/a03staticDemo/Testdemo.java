package a03staticDemo;

import java.sql.SQLOutput;

public class Testdemo {
    public static void main(String[] args) {
        Manager m=new Manager("001","zhnagshan",15000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getBonus()+",");
        m.work();
        m.eat();


        cook c=new cook("002","lishi",8000);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());
        c.work();
        c.eat();
    }

}
