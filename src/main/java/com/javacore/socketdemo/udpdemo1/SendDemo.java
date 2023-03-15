package com.javacore.socketdemo.udpdemo1;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        String message = "抗战胜利了";
        datagramSocket.send(
                new DatagramPacket
                (message.getBytes(),
                message.getBytes().length,
                InetAddress.getByName("127.0.0.1"),
                9999));
        datagramSocket.close();
    }
}
