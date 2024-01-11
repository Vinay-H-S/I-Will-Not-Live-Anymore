package com.xworkz.logic.exmaple;

public class Pattern {

	public static void main(String[] args) {

	int n=5;
	int count;
	
	for(int i=0;i<n;i++) {
		count=i+1;
		for(int j=0;j<n;j++) {
			System.out.print(count++ + " ");
		}
		System.out.println();
	}

	}

}
