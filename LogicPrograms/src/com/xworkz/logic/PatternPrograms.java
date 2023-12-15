package com.xworkz.logic;

public class PatternPrograms {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------");

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");

		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------");
		
		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 5; i++) {
				if (j == 0 || j == 4 || i==0 || i==4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
