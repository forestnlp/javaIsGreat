package com.javacore.exceptions;

public class TryCatchFinallyDemo6 {

    static class Dog{
        String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static Dog m1(){
        Dog dog = new Dog("旺旺");
        try{
            dog.name = "旺财";
            return dog;
        }
        finally {
            return new Dog("巴克");
        }
    }

    public static void main(String[] args) {
        Dog dog = m1();
        System.out.println(dog);
    }

}
