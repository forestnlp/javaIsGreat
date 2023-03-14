package com.javacore.datastruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            // mod count error
            // integers.add(1);
            iterator.remove();
        }
        System.out.println("integers="+integers);
    }
}
