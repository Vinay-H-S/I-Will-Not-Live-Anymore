package com.inheritance.chaining.app;

public class Coffee {

	public String name;
	public boolean tasty;
	public int quantity;
	public double prize;
	
	public Coffee(String name,boolean tasty,int quantity,double prize)
	{
		this.name=name;
		this.tasty=tasty;
		this.quantity=quantity;
		this.prize=prize;
		System.out.println("All-arg const of Coffee..");
	}
}
