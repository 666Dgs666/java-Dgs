package com.tomorrow.demo6;

public class seasonDemo {
    public static void main(String[] args) {
        Season spring =Season.SPRING;
        System.out.println(spring);
    }

}
//自定义枚举类
class Season
{
    //1,声明对象属性,用private final修饰,因为不想改变对象内部的属性
     private final String seasonName;
     private final String seasonDesc;

     //私有化类的构造方法,并给对象属性赋值
    //因为是枚举类,所以不想让外界创建对象
    //枚举类就是让外界用在枚举类里面已经创建好的常量类
    private Season(String seasonName,String seasonDesc)
    {
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    //3.提供当前枚举的多个类
    //public static final
    //public :让其他类可以直接调用
    //static 在外部可以直接通过枚举类的类名进行调用
    public static final Season SPRING =new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","冰天雪地");

    @Override
    public String toString() {
        return "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'';
    }
}