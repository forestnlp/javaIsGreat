package com.javacore.concurrent;

public class ThreadStopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if(i == 6){
                Thread.currentThread().stop();//过期方法，不建议使用
            }
            System.out.println(i);
        }
    }
}
