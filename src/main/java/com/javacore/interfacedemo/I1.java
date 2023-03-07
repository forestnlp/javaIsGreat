package com.javacore.interfacedemo;

public interface I1 extends I0{
    void m1();
    default void m2(){
        System.out.println("1");
    }
}
