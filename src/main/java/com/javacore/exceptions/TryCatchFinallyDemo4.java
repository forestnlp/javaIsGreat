package com.javacore.exceptions;

public class TryCatchFinallyDemo4 {

    /**
     * 此时注意，执行finally时就真的return了。
     */
    public static int m1(){

        int a = 0;
        try{
            for (int i = 0; i < 100; i++) {
                a+=i;
            }
            return a;
        }
        finally {
            return 42;
        }
    }

    public static void main(String[] args) {

        int a = m1();
        System.out.println(a);
    }

}
