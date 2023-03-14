package com.javacore.datastruct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    static class Dog implements Comparable<Dog>{
        private int age ;

        public Dog(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Dog d) {
            return d.age-age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeSet<Dog> set = new TreeSet<>();
        set.add(new Dog(1));
        set.add(new Dog(2));
        set.add(new Dog(5));
        set.add(new Dog(3));
        set.add(new Dog(4));
        System.out.println(set);

        TreeSet<Integer> set2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        set2.addAll(Arrays.asList(new Integer[]{5,3,4,3,12,3}));
        System.out.println(set2);
    }
}
