package com.inheritance.chaining.app;

public class Ground {
	public String name;
	public String location;
	public int pincode;
	public String type;
	
	public Ground(String name,String location,int pincode,String type)
	{
		this.name=name;
		this.location=location;
		this.pincode=pincode;
		this.type=type;
		System.out.println("All-arg conts of Ground..");
	}
}
