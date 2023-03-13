package com.javacore.stringdemo;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder(3);
        sb.append("ab");
        sb.append('c');
        System.out.println(sb.toString());
    }

}
