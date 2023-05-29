package studentsystem.testdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentControlDemo {
    public static void startStudentSystem() {
        ArrayList<Student> List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------欢迎来到森哥学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入你的选择:");
        loop:while (true) {
            String choose=sc.next();
            switch(choose){
                case "1":{
                    Add(List);
                    break;
                }
                case "2":{
                    remove(List);
                    break;
                }
                case "3":
                {
                    modify(List);
                    break;
                }
                case "4":{
                    query(List);
                    break;
                }
                case "5":{
                    break loop;
                }
                default:
                    System.out.println("没有这个选项");
            }
        }
    }
    //添加学生
    public static void Add(ArrayList<Student> List){
        Scanner sc=new Scanner(System.in);
        Student std=new Student();
        while (true) {
            System.out.println("请输入学生id:");
            String id=sc.next();
            boolean flag=checkId(List,id);
            if(flag)
            {
                System.out.println("id存在,请重新输入新的id");
            }
            else{
                std.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名:");
        String name=sc.next();
        std.setName(name);
        System.out.println("请输入学生年龄:");
        int age=sc.nextInt();
        std.setAge(age);
        System.out.println("请输入学生家庭住址:");
        String address=sc.next();
        std.setAddress(address);
        List.add(std);
        System.out.println("学生信息录入成功");


    }
    //删除学生信息
    public static void remove(ArrayList<Student> List){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要删除学生的id");
            String id=sc.next();
            int index=getIndex(List,id);
            if(index==-1)
            {
                System.out.println("id不存在,请重新输入");
                return;
            }
            else{
                List.remove(index);
                break;
            }
        }
        System.out.println("学生信息删除成功");

    }
    //修改学生信息
    public static void modify(ArrayList<Student> List){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要修改学生的id");
        String id=sc.next();
        int index=getIndex(List,id);
        if(index==-1){
            System.out.println("id不存在,请重新输入");
            return;
        }
        else{
            Student stu=List.get(index);
            System.out.println("请输入新的学生id:");
            String newId=sc.next();
            stu.setId(newId);
            System.out.println("请输入新的学生姓名:");
            String newName=sc.next();
            stu.setName(newName);
            System.out.println("请输入新的学生年龄");
            int newAge=sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入新的学生家庭住址");
            String newAddress=sc.next();
            stu.setAddress(newAddress);
        }
        System.out.println("学生信息修改成功");

    }
    //查询学生信息
    public static void query(ArrayList<Student> List){
        if(List.size()==0)
        {
            System.out.println("系统内还没录入学生信息,请录入后查询");
            return;
        }
        else
        {
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < List.size(); i++) {
                Student stu=List.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
            }
        }

    }
    public static boolean checkId(ArrayList<Student> List,String id)
    {
        /*for (int i = 0; i < List.size(); i++) {
            Student stu=List.get(i);
            if(id.equals(stu.getId()))
            {
                return true;
            }
        }
        return false;*/
        return getIndex(List,id)>=0;
    }
    public static int getIndex(ArrayList<Student> List,String id){
        for (int i = 0; i < List.size(); i++) {
           Student stu=List.get(i);
           if(stu.getId().equals(id))
           {
               return i;
           }
        }
        return -1;
    }

}
