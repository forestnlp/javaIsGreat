package com.javacore.concollectionsdemo;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteListDemo {
    public static void main(String[] args) {
        //CopyOnWriteArrayList<Integer> collections = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet<Integer> collections = new CopyOnWriteArraySet<>();
        //在这里也体现出Set和List的本质区别，就在于是否重复

        //添加方法：
        collections.add(1);
        collections.add(2);
        collections.add(3);
        collections.add(4);
        System.out.println(collections);//[1, 2, 3, 4]
        collections.add(3);//add方法无论元素是否存在，都可以添加进去--》添加重复的元素
        System.out.println(collections);//[1, 2, 3, 4, 3]
        //adj. 缺席的；缺少的；心不在焉的；茫然的
        //collections.addIfAbsent(33);//添加不存在的元素--》不可以添加重复的数据
        System.out.println(collections);//[1,
    }
}
