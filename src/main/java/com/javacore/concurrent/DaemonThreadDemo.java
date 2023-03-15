package com.javacore.concurrent;

public class DaemonThreadDemo {
    static class TestThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 1000 ; i++) {
                System.out.println("子线程----"+i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //创建并启动子线程：
        TestThread tt = new TestThread();
        tt.setDaemon(true);//设置伴随线程  注意：先设置，再启动
        tt.start();
        //主线程中还要输出1-10的数字：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main---"+i);
        }
        //Thread.currentThread().join();
    }
}
