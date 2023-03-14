package com.javacore.datastruct;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        for(int i:integers){
            System.out.println(i);
        }
    }
}
