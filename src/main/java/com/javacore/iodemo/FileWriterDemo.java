package com.javacore.iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\工作文档\\202212\\名师带徒\\内容.txt");
        FileWriter fw = new FileWriter(file,true);
        char[] chars = "我爱你zhongg".toCharArray();
        fw.write(chars);
        fw.close();
    }
}
