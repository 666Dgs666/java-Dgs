package com.tomorrow.demo6;

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        System.out.println(sj);
        System.out.println(sj.length());
        System.out.println(sj.toString());

    }

}
