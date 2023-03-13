package com.javacore.localtimedemo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;

public class DateFormatterDemo {

    public static void main(String[] args) {
//        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
//        String format = isoDateTime.format(LocalDateTime.now());
//        System.out.println(format);
//
//        TemporalAccessor parse = isoDateTime.parse("2023-03-13T15:49:01.603");
//        System.out.println(parse);
/*

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String format = dateTimeFormatter.format(LocalDate.now());
        System.out.println(format);
*/
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);

        TemporalAccessor parse = dateTimeFormatter.parse("2018-09-10 13:00:01");
        System.out.println(parse.toString());
    }

}
