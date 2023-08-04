package com.inheritance.chaining.app;

public class Rope {

	public String color;
	public int length;
	public double prize;
	public String type;
	
	public Rope(String color,int length,double prize,String type)
	{
		this.color=color;
		this.length=length;
		this.prize=prize;
		this.type=type;
		System.out.println("All-arg const of Rope..");
	}
	
}
