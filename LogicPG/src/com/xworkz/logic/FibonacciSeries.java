package com.xworkz.logic;

import java.util.Scanner;

public class FibonacciSeries {

    public static void fibonacciSeries(int series){
        int first=0;
        int second=1;
        int third=1;

        for(int i=1;i<=series;i++){
            System.out.print(first + ", ");

            first=second;
            second=third;
            third=first+second;
        }

    }

    public static void main(String[] args) {
//        int n=10;
//        int first=1,second=1,third;
//        System.out.print(first + " ");
//        System.out.print(second + " ");
//
//        for (int i=3;i<=n;i++){
//            third=first+second;
//            System.out.print(third + " ");
//            first=second;
//            second=third;
//        }

        fibonacciSeries(10);

    }

}
