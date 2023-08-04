package com.inheritance.chaining.boot;

import com.inheritance.chaining.app.*;

public class DiamondRunner {
	
public static void main(String[] args) {
	

	Diamond rare=new Diamond("Koh-i-Noor","loose colorless",9000,1);
	System.out.println("Brand :"+rare.brand);
	System.out.println("Type :"+rare.type);
	System.out.println("Prize :"+rare.prize);
	System.out.println("Carat :"+rare.carat);
	
	System.out.println("---------------------------");
	
	GoldenJublieDiamond rare1=new GoldenJublieDiamond();
	System.out.println("Brand :"+rare1.brand);
	System.out.println("Type :"+rare1.type);
	System.out.println("Prize :"+rare1.prize);
	System.out.println("Carat :"+rare1.carat);
	
	}	
}
