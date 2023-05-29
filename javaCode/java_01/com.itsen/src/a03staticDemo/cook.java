package a03staticDemo;

import a01staticDemo.StudentUtil;

public class cook extends Employee{

    public cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
