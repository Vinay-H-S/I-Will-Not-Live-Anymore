package com.xworkz.logic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDateFormat {
    public static void main(String[] args) {
        String date="dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
       String newDate=simpleDateFormat.format(new Date());
        System.out.println(newDate);
    }

}
