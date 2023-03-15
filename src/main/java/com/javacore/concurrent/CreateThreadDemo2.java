package com.javacore.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class CreateThreadDemo2 {

    static AtomicInteger counter = new AtomicInteger(10000);

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        int i = 0;
        for (Thread t : threads) {
            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (counter.get() > 0) {
                        int i = counter.decrementAndGet();
                        System.out.println(" 消费了一个，还剩" + i + "个");
                    }
                }
            });
            t.setName("线程" + i++);
            t.start();
        }
    }
}
