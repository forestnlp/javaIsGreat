package com.javacore.iodemo;

import java.io.*;

public class DataOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:\\a.txt"));
        dos.writeInt(100);
        dos.writeBoolean(false);
        dos.writeUTF("abc");
        dos.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File("d:\\a.txt")));
        int i = dataInputStream.readInt();
        System.out.println(i);
        boolean b = dataInputStream.readBoolean();
        System.out.println(b);
        String s = dataInputStream.readUTF();
        System.out.println(s);
        dataInputStream.close();
    }
}
