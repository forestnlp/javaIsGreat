package com.javacore.jdbcdemo;

import java.sql.*;
import java.util.LinkedList;

public class JdbcDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url="jdbc:mysql://127.0.0.1:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String user="root";
        String password="123456";
        Connection connection =DriverManager.getConnection(url, user,password );
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        String sql = "select * from test";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int res = resultSet.getInt(3);
            System.out.println("id="+id+" name="+name+" res="+res);
        }
        resultSet.close();
        statement.close();
        connection.commit();
        connection.close();
    }
}
