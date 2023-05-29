package a04staticDemo;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void KeepPet(Animal a,String something)
    {
        if(a instanceof Dog)
        {
            Dog d=(Dog)a;
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+d.getAge()+"的"+d.getColor()+"颜色的狗");
            d.eat(something);
            d.lookHome();

        }
        else if(a instanceof Cat)
        {
            Cat c=(Cat)a;
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+c.getAge()+"的"+c.getColor()+"颜色的猫");
            c.eat(something);
            c.catchMouse();
        }

    }
}
