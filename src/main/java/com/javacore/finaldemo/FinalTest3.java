package com.javacore.finaldemo;

public class FinalTest3 {

    /*
        一个被final修饰的对象 可以在方法里更改指向
     */
    static class Dog {
        private String name ;

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

    public static void  changeDog( final Dog dog){
        //出错了 不允许将final参数改变引用
        //dog = new Dog("固定编号的旺财");
    }


    public static void main(String[] args) {

        final Dog d1= new Dog("旺财7号");

       // FinalTest3.changeDog(d1);

        System.out.printf("dog=" + d1);

    }

}
