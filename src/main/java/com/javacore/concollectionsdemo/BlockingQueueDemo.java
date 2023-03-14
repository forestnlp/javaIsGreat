package com.javacore.concollectionsdemo;

import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
       // BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        queue.add(1);
        System.out.println(queue.size());

        queue.add(2);
        System.out.println(queue.size());

        queue.add(3);
        System.out.println(queue.size());

        boolean add = queue.offer(4);
        System.out.println("add="+add+"size="+queue.size());

        boolean add2 = queue.offer(5, 1,TimeUnit.SECONDS);
        System.out.println("add2="+add2+"size="+queue.size());

        queue.put(6);
        System.out.println("put="+queue+"size="+queue.size());

    }
}
