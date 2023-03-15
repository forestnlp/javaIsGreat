package com.javacore.socketdemo.udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ReceiveDemo {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了。。");
        //1.创建套接字：指定接收方的端口
        DatagramSocket ds = new DatagramSocket(9999);
        //2.有一个空的数据包，打算用来接收  对方传过来的数据包：
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        //3.接收对方的数据包，然后放入我们的dp数据包中填充
        ds.receive(dp);//接收完以后 dp里面就填充好内容了
        //4.取出数据：
        byte[] data = dp.getData();
        String s = new String(data,0,dp.getLength());//dp.getLength()数组包中的有效长度
        System.out.println("学生对我说："+s);
        //老师进行回复：
        Scanner sc = new Scanner(System.in);
        System.out.print("老师：");
        String str = sc.next();
        byte[] bytes = str.getBytes();
        //封装数据，并且指定学生的ip和端口号
        DatagramPacket dp2 = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),8888);
        //发送：
        ds.send(dp2);
        //5.关闭资源：
        ds.close();
    }
}
