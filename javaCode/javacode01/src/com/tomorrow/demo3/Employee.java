package com.tomorrow.demo3;

public class Employee {
    private String id;
    private String name;
    private int money;


    public Employee() {

    }

    public Employee(String id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }
    //工作
    public void work()
    {
        System.out.println("工人在工作");
    }
    //吃饭
    public void eat()
    {
        System.out.println("工人在吃饭");
    }



}
