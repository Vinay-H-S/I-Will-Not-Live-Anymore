package com.xworkz.logic;

public class StringContainsVowles {

    public static boolean stringContainsVowles(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Contains Vowles : " + stringContainsVowles("Vz"));
    }

}
