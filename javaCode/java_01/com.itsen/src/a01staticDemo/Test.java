package a01staticDemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> List=new ArrayList<>();
        Student s1=new Student("zhnagshna",11,"男");
        Student s2=new Student("lishi",16,"女");
        Student s3=new Student("dengliu",18,"男");
        List.add(s1);
        List.add(s2);
        List.add(s3);
        int maxage=StudentUtil.getMaxStudentAge(List);
        System.out.println(maxage);
    }
}
