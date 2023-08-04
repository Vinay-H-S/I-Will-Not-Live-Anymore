package com.inheritance.chaining.app;

public class Gold {

	public String name;
	public double prize;
	public String soldBy;
	public boolean purest;
	
	public Gold(String name,double prize,String soldBy,boolean purest)
	{
		this.name=name;
		this.prize=prize;
		this.soldBy=soldBy;
		this.purest=purest;
		System.out.println("All-arg const of Gold..");
		
	}
	
}
