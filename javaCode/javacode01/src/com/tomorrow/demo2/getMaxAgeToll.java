package com.tomorrow.demo2;

import java.util.ArrayList;

public class getMaxAgeToll {
    private getMaxAgeToll()
    {

    }
    public static int  getMaxAge(ArrayList<Student> list)
    {
        int max;
        max=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age=list.get(i).getAge();
            if(age>max)
            {
                max=age;
            }
        }
        return max;
    }
}
