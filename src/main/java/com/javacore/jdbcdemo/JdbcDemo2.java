package com.javacore.jdbcdemo;

import java.sql.*;
import java.util.LinkedList;

public class JdbcDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url="jdbc:mysql://127.0.0.1:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String user="root";
        String password="123456";
        Connection connection =DriverManager.getConnection(url, user,password );
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        LinkedList<Savepoint> savepoints =new LinkedList<Savepoint>();
        for (int i = 0; i < 100; i++) {
            String sql="insert into test(id,name,res) values("+i+",'jiejie',10)";
            int rows = statement.executeUpdate(sql);
            System.out.println("影响数据行数为:"+rows);
            savepoints.add(connection.setSavepoint());
        }
        connection.rollback(savepoints.get(50));
        statement.close();
        connection.commit();
        connection.close();
    }
}
