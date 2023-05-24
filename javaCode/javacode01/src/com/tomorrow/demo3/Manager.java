package com.tomorrow.demo3;

public class Manager extends Employee{
    private int bonus;

    public Manager() {

    }

    public Manager(String id, String name, int money, int bonus) {
        super(id, name, money);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在管理其他人");
    }
}
