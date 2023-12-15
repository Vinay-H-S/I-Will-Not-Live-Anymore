package com.xworkz.logic;

public class ReverseString {

	public static void main(String[] args) {

		// using StringBuffer class
		StringBuffer buffer = new StringBuffer("Vinay");
		System.out.println("Before reverse :" + buffer);
		System.out.println("After reverse :" + buffer.reverse());

		// using iterative method
		String name = "Harshith";

		char[] reverse = name.toCharArray();
		System.out.println("Before reverse :" + name);

		for (int i = reverse.length - 1; i >= 0; i--) {
			System.out.println(reverse[i]);
		}

		
	}
}
