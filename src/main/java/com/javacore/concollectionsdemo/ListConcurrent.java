package com.javacore.concollectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListConcurrent {

    public static void main(String[] args) {
       // List<Integer> ls = new ArrayList<>();
        List<Integer> ls = Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 1000000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    ls.add(0);
                }
            });
        }
        executorService.shutdown();
        while (true){
            if(executorService.isTerminated()){
                System.out.println(ls.size());
                break;
            }
        }
    }
}
