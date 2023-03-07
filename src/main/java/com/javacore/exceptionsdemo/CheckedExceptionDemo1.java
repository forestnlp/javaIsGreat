package com.javacore.exceptionsdemo;

public class CheckedExceptionDemo1 {
    static void m1(){
        throw new RuntimeException("运行异常");
    }

    public static void main(String[] args) {
        m1();
    }
}
