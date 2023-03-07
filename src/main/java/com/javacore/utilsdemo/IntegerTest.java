package com.javacore.utilsdemo;

public class IntegerTest {
    public static void main(String[] args) {
        Integer integer = 12;
        System.out.println(integer.getClass());

        int k = integer;
        System.out.println(k);

        Integer integer1 = Integer.valueOf(10);
        System.out.println(integer1);
    }
}
