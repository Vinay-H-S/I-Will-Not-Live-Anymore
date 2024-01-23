package com.xworkz.logic;

public class SumOfAllElements {

    public static void main(String[] args) {
        int[] array={5,5,5,5,5};
        int sum=0;
        for(int addition:array){
            sum += addition;
        }
        System.out.println(sum);
    }
}
