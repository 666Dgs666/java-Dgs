package a04staticDemo;

public class TestDemo {
    public static void main(String[] args) {
        Dog d=new Dog(2,"黑色");
        Cat c=new Cat(1,"黄色");

        Person p1=new Person("老王",30);
        p1.KeepPet(d,"骨头");
        Person p2=new Person("老李",33);
        p2.KeepPet(c,"小鱼干");

    }

}
