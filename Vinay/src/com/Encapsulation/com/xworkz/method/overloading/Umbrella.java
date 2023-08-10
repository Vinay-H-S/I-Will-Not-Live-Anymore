package com.xworkz.method.overloading;

public class Umbrella {
	
	public String color;
	public double price;
	
	public void rain()
	{
		System.out.println("invoking rain of no-arg....");
		rain("Black");
		rain(299.9);
	}
	
	public void rain(String color)
	{
		System.out.println("invoking rain of String..");
		System.out.println("Color :"+color);
	}
	
	public void rain(double price)
	{
		System.out.println("invoking rain of double...");
		System.out.println("Price :"+price);
	}
	
	public void rain(String color,double price)
	{
		System.out.println("invoking rain of String and double...");
		rain(color);
		rain(price);
	}
}
