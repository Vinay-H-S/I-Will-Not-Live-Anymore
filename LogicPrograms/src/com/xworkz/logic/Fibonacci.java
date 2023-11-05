package com.xworkz.logic;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=5;
		int first=1,second=1,third;
		System.out.println(first);
		System.out.println(second);
		
		for(int i=3;i<=n;i++) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}
}
