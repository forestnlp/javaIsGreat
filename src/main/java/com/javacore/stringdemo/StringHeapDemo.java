package com.javacore.stringdemo;

public class StringHeapDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String(s1);
        String s3 = "hell"+"o";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1=="hello");
        System.out.println(s2=="hello");
        System.out.println(s3=="hello");
    }
}
