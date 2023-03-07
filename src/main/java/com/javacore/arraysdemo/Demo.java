package com.javacore.arraysdemo;

public class Demo {
    public static void main(String[] args) {
        char[] arrays = new char[10];
        StringBuilder sb = new StringBuilder();
        for(char c:arrays) sb.append(c);
        System.out.printf("arrays:"+sb.toString());
        System.out.printf("arrays[0]="+arrays[0]);
    }
}
