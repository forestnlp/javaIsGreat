package com.javacore.concollectionsdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapConcurrent {
    public static void main(String[] args) {
        HashMap oldmap = new HashMap();
        Map map = Collections.synchronizedMap(oldmap);
        //ConcurrentHashMap map = new ConcurrentHashMap();
        //创建10个线程：
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTime = System.currentTimeMillis();
                    for (int j = 0; j < 10000000; j++) {
                        map.put("test" + j , j);
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("一共需要的时间：" + (endTime - startTime));
                }
            }).start();
        }
    }
}
