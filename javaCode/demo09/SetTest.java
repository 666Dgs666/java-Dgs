package com.tomorrow.demo09;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    @Test
    public void test()
    {
        Set set=new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add(new Person("牛批",18));
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

}
