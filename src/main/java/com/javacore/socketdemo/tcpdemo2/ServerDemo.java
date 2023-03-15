package com.javacore.socketdemo.tcpdemo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(9999);
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object o = objectInputStream.readObject();

        OutputStream outputStream = accept.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        User user = (User) o;
        if(user.getAccount().equals("admin")&&user.getPassword().equals("123123")){
            dataOutputStream.writeBoolean(true);
        }
        else {
            dataOutputStream.writeBoolean(false);
        }

        dataOutputStream.close();
        objectInputStream.close();
        accept.close();
        ss.close();
    }
}
