package com.inheritance.chaining.app;

public class PlayGround extends Ground{
	
	public PlayGround()
	{
		this("Ram Mandir Ground","4th Block Rajajinagar Banglore",560010,"Play Ground");
		System.out.println("No-arg const of PlayGround..");
	}
	
	public PlayGround(String name,String location,int pincode,String type)
	{
		super(name,location,pincode,type);
		System.out.println("All-arg const of Play Ground");
	}
	

}
