package a01staticDemo;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){

    }
    public static int getMaxStudentAge(ArrayList<Student> List){
        int max=List.get(0).getAge();
        for (int i = 1; i < List.size(); i++) {
            Student std=List.get(i);
            if(std.getAge()>max){
                max=std.getAge();
            }
        }
        return max;
    }
}
