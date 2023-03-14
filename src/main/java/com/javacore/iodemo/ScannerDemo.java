package com.javacore.iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }
//        scanner.close();

        scanner = new Scanner(new FileInputStream("d:\\a.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
