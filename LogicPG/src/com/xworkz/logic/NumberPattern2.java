package com.xworkz.logic;

public class NumberPattern2 {

    public static void main(String[] args) {

        int n=5;
        int count=1;

        for (int i = 0; i <n ; i++) {
            count=i+1;
            for (int j = 0; j <n ; j++) {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
