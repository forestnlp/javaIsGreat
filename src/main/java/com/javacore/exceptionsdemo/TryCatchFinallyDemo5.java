package com.javacore.exceptionsdemo;

public class TryCatchFinallyDemo5 {

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
            dog.name = "巴克";
            return dog;
        }
    }

    public static void main(String[] args) {
        Dog dog = m1();
        System.out.println(dog);
    }

}
