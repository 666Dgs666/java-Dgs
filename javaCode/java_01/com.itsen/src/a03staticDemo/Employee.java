package a03staticDemo;

public class Employee {
    private String id;
    private String name;
    private int  salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public void work()
    {
        System.out.println("工人在工作");
    }
    public void eat()
    {
        System.out.println("吃米饭");
    }
}
