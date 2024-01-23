package com.xworkz.logic;

import java.util.HashMap;
import java.util.Map;

public class CharCountInString {

    public static void main(String[] args) {
      String character="abcdefgabcdefg";
     char[] chars=character.toCharArray();

     Map<Character,Integer> charCount=new HashMap<>();
     for(char c:chars){
         if(charCount.containsKey(c)){
             charCount.put(c,charCount.get(c)+1);
         }else{
             charCount.put(c,1);
         }
     }
        System.out.println(charCount);
    }
}
