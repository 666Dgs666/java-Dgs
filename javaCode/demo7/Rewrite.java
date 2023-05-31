package com.tomorrow.demo7;

import java.io.IOException;
import java.lang.reflect.Method;

public class Rewrite {
    public static void main(String[] args) {

    }


}

class Father
{
    public void method1 ()throws IOException{
}
}
class Son extends Father
{
    public void method1()throws IOException
{
}
}