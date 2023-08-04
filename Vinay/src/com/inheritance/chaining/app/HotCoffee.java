package com.inheritance.chaining.app;

public class HotCoffee extends Coffee{

	public HotCoffee()
	{
		this("Arora",true,100,160);
		System.out.println("No-arg const of Hot Coffee...");
	}
	
	public HotCoffee(String name,boolean tasty,int quantity,double prize)
	{
		super(name,tasty,quantity,prize);
		System.out.println("All-arg const of Hot Coffee...");
	}
}
