package com.tomorrow.demo3;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String id, String name, int money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
