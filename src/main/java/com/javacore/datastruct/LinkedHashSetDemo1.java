package com.javacore.datastruct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(new Integer[]{1,2,5,3,3,4,3,2,1}));
        System.out.println(set);
    }
}
