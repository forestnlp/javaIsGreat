package com.javacore.reflectdemo;

public class Dog {

    private int age;
    private String name;
    private boolean male;

    public void bark(){
        System.out.println("wang wang!");
    }

    public void bark(int times,int freq){
        System.out.println(getName()+":");
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < freq; j++) {
                System.out.print("wang ");
            }
            System.out.println();
        }
    }

    public Dog() {
    }

    public Dog(int age, String name, boolean male) {
        this.age = age;
        this.name = name;
        this.male = male;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
