package com.xworkz.logic;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str="Java Programming language";
        System.out.println("Before Remove Spaces :"+str);
        str=str.replaceAll("\\s","");//1st regularExpression \\s =space,replace with "" nothing
        System.out.println(str);
    }


}
