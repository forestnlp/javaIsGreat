package com.javacore.socketdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("91porn.com");
        System.out.println(address.getHostAddress());
    }
}
