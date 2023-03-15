package com.javacore.socketdemo.tcpdemo2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your account");
        String account = scanner.next();
        System.out.println("please input your password");
        String password = scanner.next();

        User user = new User(account,password);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(user);

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        boolean b = dataInputStream.readBoolean();
        if(b){
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败");
        }

        dataInputStream.close();
        oos.close();
        scanner.close();
        socket.close();
    }
}
