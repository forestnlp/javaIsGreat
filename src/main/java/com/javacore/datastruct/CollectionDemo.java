package com.javacore.datastruct;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<Integer> integers = new ArrayList<>();
        Collection<Integer> integers2 = new ArrayList<>();
        integers.add(1);
        integers2.add(1);
        // abstractlist 的 equals方法
        System.out.println(integers.equals(integers2));
    }
}
