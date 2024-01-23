package com.xworkz.logic;

public class StringReverse {

    public static void main(String[] args) {

        String name="Vinay";
       char[] str=name.toCharArray();
       for(int i=str.length-1;i>=0;i--){
           System.out.print(str[i]);
       }

    }
}
