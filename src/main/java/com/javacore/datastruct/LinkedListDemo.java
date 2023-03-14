package com.javacore.datastruct;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.addAll(Arrays.asList(1,2,3,4,5));

        //boolean 返回值的队列方法
        ls.offer(6);
        System.out.println(ls);
        ls.poll();
        System.out.println(ls);

        //void 方法
        ls.addFirst(1);
        System.out.println(ls);
        Integer integer = ls.removeLast();
        System.out.println(ls);

        Integer integer1 = ls.pollLast();
        System.out.println(ls);


    }
}
