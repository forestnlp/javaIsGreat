package com.javacore.concollectionsdemo;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedQueue {

    static class Element implements Delayed{

        private long expiredTime;
        private String message;

        public Element(String message,long expiredTime) {
            this.message = message;
            this.expiredTime = expiredTime;
        }

        public long getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(long expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return expiredTime-System.currentTimeMillis();
        }

        @Override
        public int compareTo(Delayed o) {
            Element o2= (Element)o;
            return ((Long)(this.getExpiredTime())).compareTo((Long)(o2.getExpiredTime()));
        }
    }

    public static void main(String[] args) throws InterruptedException {

        DelayQueue<Element> dq = new DelayQueue<>();
        dq.add(new Element("hello",System.currentTimeMillis()+5000));
        dq.add(new Element("hello2",System.currentTimeMillis()+2000));
        dq.add(new Element("hello3",System.currentTimeMillis()+10000));

        while (!dq.isEmpty()) {
            Element take = dq.take();
            System.out.println(take.getMessage());
        }
    }
}
