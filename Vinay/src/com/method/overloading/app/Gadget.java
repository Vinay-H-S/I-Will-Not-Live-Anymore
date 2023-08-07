package com.method.overloading.app;

public class Gadget {

	public String type;
	public double price;
	
	
	public void item()
	{
		System.out.println("invoking item of no-arg..");
		item("Mobile");
		item(14999);
	}
	
	public void item(String type)
	{
		System.out.println("invoking item of String..");
		System.out.println("Type :"+type);
	}
	
	public void item(double price)
	{
		System.out.println("invoking item of double...");
		System.out.println("Price :"+price);
	}
	
	public void item(String type,double price)
	{
		item(type);
		item(price);
	}
	
}
