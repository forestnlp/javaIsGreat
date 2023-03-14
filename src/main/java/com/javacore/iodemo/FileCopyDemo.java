package com.javacore.iodemo;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\工作文档\\202212\\名师带徒\\内容.txt");
        File file2 = new File("D:\\工作文档\\202212\\名师带徒\\内容2.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file2);
//        int n = fis.read();
//        while(n!=-1){
//            System.out.println(n);
//            n = fis.read();
//        }
        byte[] b = new byte[1024];
        int len = fis.read(b);
        while (len!=-1){
            fos.write(b,0,len);
            len = fis.read(b);
        }
        fos.close();
        fis.close();
    }
}
