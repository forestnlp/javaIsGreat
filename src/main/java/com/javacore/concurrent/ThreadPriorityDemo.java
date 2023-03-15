package com.javacore.concurrent;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadPriorityDemo {
    /*

        由于没有加锁 这段代码本身有一些问题的
    * */
    private static AtomicLong resources = new AtomicLong(1000*1000*1000);
    private static AtomicLong getResourcesAll = new AtomicLong(0);

    static class ThreadCounter extends Thread{
        static ThreadLocal<Long> getResoureces = new ThreadLocal<>();
        @Override
        public void run() {
            getResoureces.set(new Long(0));
            while (resources.get()>0) {
                resources.decrementAndGet();
                getResoureces.set(getResoureces.get()+1);
            }
            System.out.println(this.getName()+",获取资源:"+getResoureces.get());
            getResourcesAll.addAndGet(getResoureces.get());
            System.out.println(getResourcesAll);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread threadCounter = new ThreadCounter();
            threadCounter.setPriority(i+1);
            threadCounter.setName("thread"+i);
            threadCounter.start();
        }
    }

}
