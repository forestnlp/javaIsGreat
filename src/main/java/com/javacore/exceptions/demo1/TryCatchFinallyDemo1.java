package com.javacore.exceptions.demo1;

public class TryCatchFinallyDemo1 {


    public static void main(String[] args) {

        try{
            System.out.println("1");
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

    }

}
