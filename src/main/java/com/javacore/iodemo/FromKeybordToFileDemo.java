package com.javacore.iodemo;

import java.io.*;

public class FromKeybordToFileDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("D:\\b.txt")));

        String str = bufferedReader.readLine();
        while (!str.equals("exit")){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            str = bufferedReader.readLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
