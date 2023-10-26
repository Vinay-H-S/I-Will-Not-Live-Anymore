package com.test.assignment;

public class Pangram {

	public static void allphabets(String letters) {
		letters = letters.toUpperCase();

		boolean allphabetsPresent = true;

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (!letters.contains(String.valueOf(ch))) {
				allphabetsPresent = false;
				break;
			}
		}
		if (allphabetsPresent)
			System.out.println("this is pangram");
		else
			System.out.println("this is not pangram");
	}

	public static void main(String args[]) {
		String allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		allphabets(allLetters);
	}
}
