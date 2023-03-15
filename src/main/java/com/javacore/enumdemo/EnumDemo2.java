package com.javacore.enumdemo;

public enum EnumDemo2 {
    YIN("阴") {
        @Override
        public void m1(){
            System.out.println("m1 yin");
        }
    },
    YANG("阳") {
        @Override
        public void m1(){
            System.out.println("m1 yang");
        }
    };

    public void m1() {
        System.out.println("m1");
    }

    private final String name;

    private EnumDemo2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnumDemo2{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(EnumDemo2.YIN);
        System.out.println(EnumDemo2.YANG);
        System.out.println(EnumDemo2.class.getSuperclass().getSuperclass().getName());
        EnumDemo2[] values = EnumDemo2.values();
        for (EnumDemo2 e2 : values) {
            System.out.println(e2);
            e2.m1();
        }
    }
}
