package com.tomorrow.demo09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List stulist =new ArrayList();
        System.out.println("请录入学生信息");
        while(true)
        {
            System.out.println("请输入你的选择: 1.继续录入----0.结束录入");
            int op=sc.nextInt();
            if(op==0)
            {
                break;
            }
            else if(op==1)
            {
                System.out.println("请输入学生的姓名");
                String name=sc.next();
                System.out.println("请输入学生年龄");
                int age=sc.nextInt();
                Student s=new Student(name,age);
                stulist.add(s);
            }
            else
            {
                System.out.println("选择错误请重新选择");
            }

        }
        //遍历集合内部元素
        for(Object stu:stulist)
        {
            System.out.println(stu);
        }

    }
}
