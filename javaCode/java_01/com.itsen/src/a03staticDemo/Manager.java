package a03staticDemo;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String id, String name, int salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public Manager() {
        ;
    }

    @Override
    public void work() {
        System.out.println("经理在管理员工");
    }
}
