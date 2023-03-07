package com.javacore.exceptionsdemo;

public class TryCatchFinallyDemo2 {


    public static void main(String[] args) {

        System.out.println("0-");

        try{
            System.out.println("1-");
            int [] arr = new int[10];
            for (int i = 0; i < arr.length+1; i++) {
                System.out.println(arr[i]);
            }
            return;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2");
        }
        finally {
            System.out.println("3");
        }

        System.out.println("4");
    }

}
