package com.tomorrow.demo8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DulicateTest {

    public static void main(String[] args) {
        ArrayList newlist = new ArrayList();
        newlist.add(11);
        newlist.add(11);
        newlist.add(11);
        newlist.add(22);
        newlist.add(22);
        newlist.add(22);
        newlist.add(33);
        newlist.add(33);
        newlist.add(33);
        newlist.add(33);
        List list=dulicate(newlist);
        System.out.println(list);
//        for(Object obj:list)
//        {
//            System.out.println(obj);
//        }

    }
    public static List dulicate (List list){
        HashSet hashSet = new HashSet(list);
        List newlist= new ArrayList(hashSet);
        return newlist;

    }

}
