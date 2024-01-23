package com.xworkz.logic;

public class StringContainsVowles {

    public static boolean stringContainsVowles(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {

        System.out.println(stringContainsVowles("Vinay"));
    }

}
