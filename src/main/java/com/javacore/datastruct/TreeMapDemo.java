package com.javacore.datastruct;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    static class Dog implements Comparable<Dog>{
        private int age;

        public Dog(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Dog o) {
            return o.age-this.age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        map.put(1,"a");
        map.put(10,"a");
        map.put(16,"a");
        map.put(14,"a");
        map.put(12,"a");
        map.put(2,"b");
        System.out.println(map+","+map.size());


        Map<Dog,String> map2 = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map2.put(new Dog(i),"a");
        }
        System.out.println(map2);
    }
}
