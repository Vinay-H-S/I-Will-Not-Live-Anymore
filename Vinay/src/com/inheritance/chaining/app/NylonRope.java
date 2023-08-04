package com.inheritance.chaining.app;

public class NylonRope extends Rope{
	
	public NylonRope()
	{
		this("Yellow",600,399,"Polypropeline");
		System.out.println("No-arg const of Nylon Rope...");	
	}
	
	public NylonRope(String color,int length,double prize,String type)
	{
		super(color,length,prize,type);
		System.out.println("All-arg const of Nylon Rope...");
	}

}
