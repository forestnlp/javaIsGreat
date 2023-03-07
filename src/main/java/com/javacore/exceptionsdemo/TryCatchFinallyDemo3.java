package com.javacore.exceptionsdemo;

public class TryCatchFinallyDemo3 {

    /**
     * 这个地方是很需要注意的。
     * 此时将a值暂存，去执行finally的语句，尽管finally对a改了值，但不影响缓存值。
     * @return
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
            a = 66;
        }
    }

    public static void main(String[] args) {

        int a = m1();
        System.out.println(a);
    }

}
