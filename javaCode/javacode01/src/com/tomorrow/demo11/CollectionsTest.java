package com.tomorrow.demo11;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    @Test
    public void test1()
    {
        List list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        Integer max1 = (Integer) Collections.max(list);
        System.out.println(max1);
        Integer max2= (Integer) Collections.max(list,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer&&o2 instanceof Integer)
                {
                    Integer a1=(Integer)o1;
                    Integer a2=(Integer)o2;
                    return a2.intValue()-a1.intValue();
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(max2);
//取最大就是取最右边的数,如果是按照大到小进行排序,则取得的最大值就是最小的数
        int cnt=Collections.frequency(list,11);
        System.out.println(cnt);

    }

    @Test
    public void test2()
    {
        HashMap<String,Integer> hashmap=new HashMap<>();
        hashmap.put("Tom",66);
        hashmap.put("Mary",77);
        hashmap.put("Jack",88);
        Set<Map.Entry<String, Integer>> entries = hashmap.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entries.iterator();

//        var entries = hashmap.entrySet();//可以用var来替代前面的类型和泛型
//                                        //因为编译器通过传来的数据进行自动识别泛型
//        var entryIterator = entries.iterator();
        while(entryIterator.hasNext())
        {
            Map.Entry<String, Integer> next = entryIterator.next();
            String key=next.getKey();
            int value=next.getValue();
            System.out.println(key + "---->" + value);
        }

    }




}
