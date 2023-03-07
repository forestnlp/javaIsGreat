package com.javacore.abstractdemo;

public class Dog extends Animal {


    public Dog() {
        System.out.println("constructing dog");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
    }

}

