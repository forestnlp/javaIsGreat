package com.javacore.concurrent;

public class SynchronizedDemo1 {

    private volatile static int totalResources = 1000;
    private volatile static int newResources = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (SynchronizedDemo1.class) {
                        while (totalResources > 0) {
                            synchronized (SynchronizedDemo1.class) {
                                totalResources--;
                                newResources++;
                            }
                        }
                    }
                }
            }).start();
        }

        //Thread.currentThread().join();
        Thread.sleep(2000);
        System.out.println(totalResources);
        System.out.println(newResources);
    }
}
