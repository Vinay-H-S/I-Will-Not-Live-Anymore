package com.xworkz.logic;

public class NumberPatterns {

	public static void main(String[] args) {

		int n = 5;
		int count = 1;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {

				if (count < 10) {
					System.out.print("0");
				}
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		int length=5;
		for(int i=1;i<=length;i++) {
			for(int j=1;j<=length;j++) {
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		int nn=5;
		int countt;
		for(int i=0;i<nn;i++) {
			countt=i+1;
			for(int j=0;j<nn;j++) {
				System.out.print(countt++);
			}
			System.out.println();
		}
		
	}

}
