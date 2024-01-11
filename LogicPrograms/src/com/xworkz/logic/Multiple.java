package com.xworkz.logic;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		for(int i=1;i<=10;i++) {
			int number1=number*i;
			System.out.println(number+"*"+i+"="+number1);
		}
	}

}
