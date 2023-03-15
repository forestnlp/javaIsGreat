package com.javacore.enumdemo;

public class EnumDemo1 {
    private EnumDemo1(String name){
    }

    public static final EnumDemo1 Yin = new EnumDemo1("阴");
    public static final EnumDemo1 Yang = new EnumDemo1("阳");

    public static void main(String[] args) {
        System.out.println(EnumDemo1.Yin);
        System.out.println(EnumDemo1.Yang);
    }
}
