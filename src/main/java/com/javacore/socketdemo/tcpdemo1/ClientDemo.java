package com.javacore.socketdemo.tcpdemo1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",9999);
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("BUBB");
        dataOutputStream.close();
        s.close();
    }
}
