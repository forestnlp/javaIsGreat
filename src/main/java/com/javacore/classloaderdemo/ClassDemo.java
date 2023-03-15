package com.javacore.classloaderdemo;

public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<ClassDemo> classDemoClass = ClassDemo.class;
        System.out.println(classDemoClass);
        Class<? extends ClassDemo> aClass = new ClassDemo().getClass();
        System.out.println(aClass);
        System.out.println(aClass==classDemoClass);

        Class<?> aClass1 = ClassDemo.class.getClassLoader().loadClass("com.javacore.classloaderdemo.ClassDemo");
        System.out.println(aClass==aClass1);

        Class<?> aClass2 = Class.forName("com.javacore.classloaderdemo.ClassDemo");
        System.out.println(aClass==aClass2);
    }
}
