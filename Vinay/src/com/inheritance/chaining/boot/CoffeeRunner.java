package com.inheritance.chaining.boot;

import com.inheritance.chaining.app.*;

public class CoffeeRunner {

	public static void main(String[] args) {
		
	
	Coffee hot=new Coffee("Nescafe",true,150,170);
	System.out.println("Name :"+hot.name);
	System.out.println("Tasty :"+hot.tasty);
	System.out.println("Quantity :"+hot.quantity);
	System.out.println("Prize :"+hot.prize);
	
	System.out.println("------------------------");
	
	HotCoffee hot1=new HotCoffee();
	System.out.println("Name :"+hot1.name);
	System.out.println("Tasty :"+hot1.tasty);
	System.out.println("Quantity :"+hot1.quantity);
	System.out.println("Prize :"+hot1.prize);

	}
}
