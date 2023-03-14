package com.javacore.concollectionsdemo;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue();
        Random random = new Random();
        while (pq.size()<100) pq.put(random.nextInt(100));
        while (!pq.isEmpty())
            System.out.println(pq.take());
    }
}
