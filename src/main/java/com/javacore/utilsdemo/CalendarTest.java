package com.javacore.utilsdemo;

import sun.misc.Cleaner;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c1 = new GregorianCalendar();
        System.out.println(c1);
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));

        c1.set(1,2018);
        System.out.println(c1.getActualMaximum(2));
        System.out.println(c1.getActualMinimum(2));

        c1.setTime(new Date());
        System.out.println(c1);

        Date time = c1.getTime();
        System.out.println(time.getClass());

    }
}
