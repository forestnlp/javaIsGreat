package com.javacore.genericdemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericNotInherit {
    public static void main(String[] args) {
        Object o = new String("1");
        System.out.println(o);

        Object[] os = new String[]{"hello,","world!"};
        System.out.println(Arrays.toString(os));

        // Error here
        // List<Object> ls = new ArrayList<Integer>();
    }
}
