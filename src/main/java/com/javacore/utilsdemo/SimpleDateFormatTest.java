package com.javacore.utilsdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parseDate = simpleDateFormat.parse("2023-03-07 13:32:20");
        System.out.println(parseDate.toLocaleString());
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);

        Calendar c1 = Calendar.getInstance();
        String format1 = simpleDateFormat.format(c1);
        System.out.println(c1);
    }
}
