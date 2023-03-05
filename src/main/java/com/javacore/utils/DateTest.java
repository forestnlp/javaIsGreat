package com.javacore.utils;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear()+1900);
        System.out.println(date.toLocaleString());
        System.out.println(System.currentTimeMillis());
        System.out.println(date.toGMTString());
        System.out.println(java.sql.Date.valueOf("2013-03-26"));
//        System.out.println(java.sql.Date.valueOf("2023-03-05 22:18"));
    }
}
