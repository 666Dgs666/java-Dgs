package com.tomorrow.demo1;

public class arrayToll {
    //工具类，创建对象没有意义，构造方法私有化
    private void arrayToll()
    {

    }
    public static double toAverage(int [] arr)
    {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum/arr.length;
    }

}
