package com.javacore.genericdemo;

import java.math.BigDecimal;

public class GenericMethodDemo<E> {

    public void method1(E e){
        System.out.println(e);
    }

    public static<T> void sout(T t){
        System.out.println("here it is ,"+t);
    }

    public static void main(String[] args) {
        GenericMethodDemo.sout(new Integer(10));
        GenericMethodDemo.sout(new String("hello"));
        GenericMethodDemo.sout(new BigDecimal(1000));

        GenericMethodDemo<Integer> methodDemo = new GenericMethodDemo<>();
        methodDemo.method1(10);

    }
}
