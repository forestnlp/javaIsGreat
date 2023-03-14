package com.javacore.iodemo;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream(new File("D:\\a.txt"));
        InputStreamReader isr = new InputStreamReader(is,"UTF-8");
        char[] ch = new char[20];
        int len = isr.read();
        while (len!=-1){
            System.out.println(new String(ch,0,len));
            len = isr.read(ch);
        }
        isr.close();
    }
}
