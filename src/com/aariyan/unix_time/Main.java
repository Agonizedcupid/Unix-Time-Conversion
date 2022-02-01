package com.aariyan.unix_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        //For Converting Date to UnixTimeStamp:
        String pattern = "MM/dd/yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("02/01/2022 15:53");
        long unixTime = date.getTime();
        System.out.println(unixTime);

        //Converting Unix time to date Like: Tue Feb 01 00:00:00 BDT 2022
        java.util.Date time = new java.util.Date((long) unixTime * 1000);
        System.out.println(time);
    }
}
