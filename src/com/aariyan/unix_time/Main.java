package com.aariyan.unix_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        //For Converting Date to UnixTimeStamp:
        String pattern = "MM/dd/yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("02/01/2022 17:34");
        long unixTime = date.getTime();
        System.out.println(unixTime);

        //This will not work all the time
        //long d = 1643714760000;
        //Converting Unix time to date Like: Tue Feb 01 00:00:00 BDT 2022
        java.util.Date time = new java.util.Date((long) unixTime * 1000);
        System.out.println(time);


        //Appropriate Functionality:
        // Getting the calendar class instance
        Calendar calendar = Calendar.getInstance();

        // Passing the long value to calendar class function
        calendar.setTimeInMillis(unixTime);
        System.out.println(calendar.getTime());
    }
}
