package com.tomorrow.demo11;

import org.junit.Test;

import java.util.*;

public class SingersTest {

    public static void main(String[] args) {
        HashMap singers=new HashMap();
        String singer="周杰伦";
        ArrayList songs = new ArrayList();
        songs.add("稻香");
        songs.add("七里香");
        songs.add("晴天");
        singers.put(singer,songs);
        Set singerset = singers.entrySet();
        Iterator singeriterator = singerset.iterator();
        while(singeriterator.hasNext()){
            Map.Entry entry= (Map.Entry) singeriterator.next();
            System.out.println("歌手:" + entry.getKey());
            System.out.println("歌曲:" + entry.getValue());
        }

    }

}
