package com.javacore.concurrent;

public class ThreadJoinDemo {

    static class TestThread extends Thread {
        public TestThread(String name){
            super(name);
        }
        @Override
        public void run() {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(this.getName()+"----"+i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("main-----"+i);
            if(i == 6){
                //创建子线程：
                TestThread tt = new TestThread("子线程");
                tt.start();
                tt.join();//“半路杀出个程咬金” 而且你们一直要等tt，等到他执行后再合并执行
                System.out.println("over");
            }
        }
    }
}
