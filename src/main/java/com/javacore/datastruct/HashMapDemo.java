package com.javacore.datastruct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        for (int i = 65; i < 127; i++) {
            map.put(i, String.valueOf((char) i));
        }

        Set<Integer> integers = map.keySet();
        for (int s:integers){
            System.out.println(s+":"+map.get(s));
        }

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
    }
}
