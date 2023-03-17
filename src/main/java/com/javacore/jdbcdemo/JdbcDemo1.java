package com.javacore.jdbcdemo;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url="jdbc:mysql://127.0.0.1:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String user="root";
        String password="123456";
        Connection connection =DriverManager.getConnection(url, user,password );
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        String sql="insert into test values(6,'jiejie',6)";
        int rows = statement.executeUpdate(sql);
        System.out.println("影响数据行数为:"+rows);
        statement.close();
        connection.commit();
        connection.close();
    }
}
