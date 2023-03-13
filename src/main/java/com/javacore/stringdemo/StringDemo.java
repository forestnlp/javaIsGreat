package com.javacore.stringdemo;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "hello";
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(s.charAt(1));


        String s1 = "a1";
        String s2 = "a2";
        String s3 = "a00";
        String s4 = "a10";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println("abc".compareTo("abc0"));


        System.out.println(s1.concat(s3));
        System.out.println(" abc  dd  ".trim());
        System.out.println(String.valueOf(false));
        System.out.println(String.valueOf(true));
    }
}
