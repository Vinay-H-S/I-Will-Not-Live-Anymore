package com.inheritance.chaining.app;

public class Diamond{

	public String brand;
	public String type;
	public double prize;
	public int carat;
	
	public Diamond(String brand,String type,double prize,int carat)
	{
		this.brand=brand;
		this.type=type;
		this.prize=prize;
		this.carat=carat;
		
	System.out.println("All-arg const of Diamond..");
	}
}
