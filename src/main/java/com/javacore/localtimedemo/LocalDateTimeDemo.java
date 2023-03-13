package com.javacore.localtimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        now.withMonth(10);
        System.out.println(now);
        System.out.println(now.withMonth(10));


        LocalDate of = LocalDate.of(2018, 3, 19);
        System.out.println(of);

    }

}
