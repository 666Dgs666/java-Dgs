package com.tomorrow.demo6;

public class seasonDemo2 {
    public static void main(String[] args) {
        Season2 s2=Season2.SPRING;
        System.out.println(s2);
    }
}
//用enum关键字来定义一个枚举类
//与自定义枚举类不同的是,枚举对象在最上面,且枚举对象的创建也有所不同
//具体见下方
enum  Season2
{
    //1.最开始就要定义常量对象,并且在enum定义的枚举类中相同的都必须删掉
    //枚举对象末尾都用逗号,最后一个用分号;
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    //1,声明对象属性,用private final修饰,因为不想改变对象内部的属性
    private final String seasonName;
    private final String seasonDesc;

    //私有化类的构造方法,并给对象属性赋值
    //因为是枚举类,所以不想让外界创建对象
    //枚举类就是让外界用在枚举类里面已经创建好的常量类
    private Season2(String seasonName,String seasonDesc)
    {
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    //枚举类都继承与Enum类
    //如果不重写toString,则使用的是Enum的toString方法打印,
    //在外部打印创建好的对象时,只会打印常量名
    @Override
    public String toString() {
        return "seasonName2='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'';
    }
}

