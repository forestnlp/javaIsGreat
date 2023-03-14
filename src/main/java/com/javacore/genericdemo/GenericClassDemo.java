package com.javacore.genericdemo;

public class GenericClassDemo {

    static class G1<T>{
        T t;

        public void sout(){
            System.out.println("t="+t.getClass()+","+t.toString());
        }
    }


    public static void main(String[] args) {

        G1<Integer> g1 = new G1<>();
        g1.t = 100;
        g1.sout();

        G1<String> stringG1 = new G1<>();
        stringG1.t = "hello";
        stringG1.sout();
    }

}
