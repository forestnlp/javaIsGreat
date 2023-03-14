package com.javacore.iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\工作文档\\202212\\名师带徒\\内容.txt");
        FileReader fileReader = new FileReader(file);
//        int n= fileReader.read();
//        while(n!=-1){
//            System.out.println((char)n);
//            n = fileReader.read();
//        }

        /*int n;
        while ((n= fileReader.read())!=-1){
            System.out.println((char)n);
        }*/

        char[] ch = new char[5];
        int len = fileReader.read(ch);
        while (len!=-1){
            for (int i = 0; i < len; i++) {
                System.out.print(ch[i]);
            }
            //String str = new String(ch,0,len);
            //System.out.println(str);
            System.out.println();
            len = fileReader.read(ch);
        }

        fileReader.close();
    }
}
