package com.javacore.finaldemo;


public class FinalTest2 {
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
    /*
        d1 仍然不允许在外部指向新的引用
     */

    public static Dog changeDog(Dog dog){
        //这个方法里可以临时改变，但是没有改变d1的赋值
        dog = new Dog("固定编号的旺财");
        return dog;
    }


    public static void main(String[] args) {

        final Dog d1= new Dog("旺财7号");

        //d1 = FinalTest2.changeDog(d1);

        System.out.printf("dog=" + d1);

    }

}
