package com.xworkz.logic;

public class RevreseArray {

    public static void reverseArray(int[] ar){
        int i=0,j=ar.length-1;
        while(i<j){
            int third=ar[i];
            ar[i]=ar[j];
            ar[j]=third;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] ar={1,2,3,4,5,6,7,8,9,10};
        for(int arr:ar){
            System.out.print(arr + " ");
        }

        System.out.println();
        reverseArray(ar);
        for(int arr:ar){
            System.out.print(arr + " ");
        }
    }

}
