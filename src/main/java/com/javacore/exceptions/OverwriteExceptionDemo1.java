package com.javacore.exceptions;

import java.io.IOException;

public class OverwriteExceptionDemo1 {
    /*
    子类的权限要更开放
     */
   static class A{
         void m1() throws IOException{
            System.out.println(this.getClass()+"m1");
        }
    }

    static class B extends A{
        @Override
        /*
        必须更明确 而不能更抽象
         */
//        void m1() throws Exception {
        void m1() throws IOException {
            System.out.println(this.getClass()+"m1");
        }
    }

    public static void main(String[] args) {
        A b = new B();
        try {
            b.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
