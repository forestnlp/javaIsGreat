package com.javacore.reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionDemo2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Dog> dogClass = Dog.class;
        Field[] fields = dogClass.getDeclaredFields();
        //dogClass.getFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        Field field = dogClass.getDeclaredField("age");
        int modifiers = field.getModifiers();
        System.out.println(Modifier.toString(modifiers));
    }
}
