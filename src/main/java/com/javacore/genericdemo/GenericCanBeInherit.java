package com.javacore.genericdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class GenericCanBeInherit {

    public static void test(Collection<?> list){
        System.out.println("i can accept it ." + list.getClass());
        //不允许这样添加
        // list.add("a");
        list.add(null);
        for(Object o:list){
            System.out.println(o);
        }

    }

    public static void main(String[] args) {
        List<Integer> ls1 =new ArrayList<>();
        List<String> ls2 =new ArrayList<>();
        List<Date> ls3 =new ArrayList<>();

        //? can be the abstract class
        List<?> ls = ls1==null?ls2:ls3;
        GenericCanBeInherit.test(ls2);
    }
}
