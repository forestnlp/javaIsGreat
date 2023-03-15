package com.javacore.socketdemo.tcpdemo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    static class ServerThread extends Thread {//线程：专门处理客户端的请求
        InputStream is = null;
        ObjectInputStream ois = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        Socket s = null;

        public ServerThread(Socket s) {
            this.s = s;
        }

        @Override
        public void run() {
            try {
                //2.等着客户端发来的信息：
                is = s.getInputStream();
                ois = new ObjectInputStream(is);
                //4.读取客户端发来的数据：
                User user = (User) (ois.readObject());
                //对对象进行验证：
                boolean flag = false;
                if (user.getAccount().equals("admin") && user.getPassword().equals("123123")) {
                    flag = true;
                }
                //向客户端输出结果：---》操作流---》输出流
                os = s.getOutputStream();
                dos = new DataOutputStream(os);
                dos.writeBoolean(flag);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (dos != null) {
                        dos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (os != null) {
                        os.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("服务器启动了");
        //1.创建套接字： 指定服务器的端口号
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;//定义一个计数器，用来计数  客户端的请求
        try {
            ss = new ServerSocket(9999);
            while(true){//加入死循环，服务器一直监听客户端是否发送数据
                s = ss.accept();//阻塞方法:等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行。
                //每次过来的客户端的请求 靠 线程处理：
                new ServerThread(s).start();
                count++;
                //输入请求的客户端的信息：
                System.out.println("当前是第"+count+"个用户访问我们的服务器,对应的用户是："+s.getInetAddress());
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
