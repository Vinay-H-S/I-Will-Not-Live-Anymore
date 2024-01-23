package com.xworkz.logic;

public class FIndSecondLargestNoInArray {

    public static int findSecondLargest(int[] array){
       int highest=Integer.MIN_VALUE;
       int secondHighest=Integer.MIN_VALUE;

       for (int i:array){
           if(i>highest){
              secondHighest=highest;
              highest=i;
           } else if (i>secondHighest) {
               secondHighest=i;
           }
       }
       return secondHighest;

    }

    public static void main(String[] args) {

        int[] arrays={1,700,101,102,78};
        System.out.println( " Second Highest Number :"+findSecondLargest(arrays));
    }

}
