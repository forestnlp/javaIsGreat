package com.javacore.classloaderdemo;

import java.lang.annotation.Target;

public class ClassDemo2 {
    public static void main(String[] args) {
        Class<ClassDemo2> classDemo2Class = ClassDemo2.class;
        System.out.println(classDemo2Class);
        Class<Comparable> comparableClass = Comparable.class;
        System.out.println(comparableClass);
        Class<Override> overrideClass = Override.class;
        System.out.println(overrideClass);
        Class<Target> targetClass = Target.class;
        System.out.println(targetClass);

        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        Class<Void> voidClass = void.class;
        System.out.println(voidClass);
        int[] arr = {};
        System.out.println(arr.getClass());

        System.out.println(Class.class.getClass().getSuperclass().getName());
    }
}
