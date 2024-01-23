package com.xworkz.logic;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};

        Random random=new Random();

        for(int i=0;i<array.length;i++){
          int  radomIndexToSwap=random.nextInt(array.length);
          int temp=array[radomIndexToSwap];
          array[radomIndexToSwap]=array[i];
          array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
