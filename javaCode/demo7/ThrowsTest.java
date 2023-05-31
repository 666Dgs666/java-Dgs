package com.tomorrow.demo7;

public class ThrowsTest {

    public static void main(String[] args) {
        Student s1=new Student();
        try {
            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);


        } catch (Exception e) {
            e.printStackTrace();
    }
    }

    static class Student
    {
        int id;
        public void regist(int id) throws idBlowZeroException {
        if(id>0){
            this.id=id;
        }
        else
        {
            throw new idBlowZeroException("输入的id有误");
        }
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    '}';
        }
    }

}
