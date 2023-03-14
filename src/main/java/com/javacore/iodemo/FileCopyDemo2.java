package com.javacore.iodemo;

import java.io.*;

public class FileCopyDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\213.jpeg");
        File f2 = new File("D:\\321.jpeg");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] b =new byte[1024*6];
        int len = bis.read(b);
        while (len!=-1){
            bos.write(b,0,len);
            len = bis.read(b);
        }
        bos.close();
        bis.close();
    }
}
