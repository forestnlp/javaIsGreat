package com.javacore.reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo1 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Dog.class;
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor :
                constructors) {
            System.out.println(constructor);
        }

        Constructor defaultConstructor = cls.getConstructor();
        Object o1 = defaultConstructor.newInstance();
        Dog dog1 = (Dog)o1;
        dog1.bark(3,15);

        Constructor constructor1 = cls.getConstructor(String.class);
        Object o2 = constructor1.newInstance("旺财");
        Dog dog2 = (Dog) o2;
        dog2.bark(4,3);

        Constructor constructor2 = cls.getConstructor(int.class, String.class);
        Object o3 = constructor2.newInstance(6,"happy");
        Dog dog3 = (Dog) o3;
        dog3.bark(4,3);

    }

}
