package com.javacore.exceptions;

import java.io.IOException;

public class CheckedExceptionDemo2 {
    static void m1() throws Exception {
        throw new Exception("checked异常");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
