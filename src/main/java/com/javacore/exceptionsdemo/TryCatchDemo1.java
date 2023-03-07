package com.javacore.exceptionsdemo;

public class TryCatchDemo1 {

    public static void main(String[] args) {
        try{
            int [] arr = new int[10];
            for (int i = 0; i < arr.length+1; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}
