package com.javacore.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class CreateThreadDemo3 {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i = new Random().nextInt(1000);
                System.out.println(i);
                return i;
            }
        });
        new Thread(futureTask).start();
    }
}
