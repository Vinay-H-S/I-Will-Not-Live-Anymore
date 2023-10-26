package com.test.assignment;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

	public static void shuffle(int[] numbers) {
		for(int i=numbers.length-1;i>=1;i--) {
			Random random=new Random();
			int j=random.nextInt(i+1);
			shuffle_elements(numbers, i, j);
		}
	}
	
	public static void shuffle_elements(int[] numbers,int i,int j)
	{
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}
	
	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,6,7};
		System.out.println("Original Arrays :"+Arrays.toString(numbers));
		shuffle(numbers);
		System.out.println("\nAfter Shuffle Array :" + Arrays.toString(numbers));
	}
}
