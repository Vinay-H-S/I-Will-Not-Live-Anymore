package com.xworkz.logic;

import java.util.Scanner;

public class PrimeNumbers {

    public static boolean primeNumber(int n){
       if(n==0 || n==1){
           return false;
       }
       if(n==2){
           return true;
       }

       for (int i=2;i<=n/2;i++){
           if(n%i==0){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(primeNumber(num));
    }

}
