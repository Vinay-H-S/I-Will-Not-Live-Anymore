package com.method.overloading.app;

public class Elevator {

	public String company;
	public int capacity;
	
	public void lift()
	{
		System.out.println("invoking lift of no-arg..");
		lift("Schindler");
		lift(600);
	}
	
	public void lift(String company)
	{
		System.out.println("invoking lift of String..");
		System.out.println("Company : "+company);
	}
	
	public void lift(int capacity)
	{
		System.out.println("invoking lift of int..");
		System.out.println("Capacity : "+capacity);
	}
	
	public void lift(String company,int capacity)
	{
		lift(company);
		lift(capacity);
	}
}
