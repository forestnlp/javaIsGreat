package com.javacore.socketdemo.udpdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Receiver 上线");
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(dp);
        byte[] data = dp.getData();
        System.out.println("from client,received :"+new String(data,0,dp.getLength()));
        datagramSocket.close();
    }
}
