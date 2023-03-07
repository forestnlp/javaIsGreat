package com.javacore.finaldemo;

public class FinalTest {

    /*
        一个被final修饰的对象 可以在方法里更改指向吗？
        不允许 外部的d1 引用不变
     */

    public static void  changeDog(Dog dog){
        dog = new Dog("固定编号的旺财");
    }


    public static void main(String[] args) {

        final Dog d1= new Dog("旺财7号");

        //FinalTest.changeDog(d1);

        System.out.printf("dog=" + d1);

    }

}
