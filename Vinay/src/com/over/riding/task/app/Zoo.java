package com.over.riding.task.app;

public class Zoo {

	public String name;
	public String location;
	public int ticketPrice;
	public int noOfAnimals;
	public int since;
	
	public void protect()
	{
		System.out.println("invoking protect of no-arg..");
	}
	
	public void protect(String name)
	{
		System.out.println("invoking protect of String");
	}
	
	public void protect(String name,String location)
	{
		System.out.println("invoking protect of String and String");
	}
	
	public void protect(String name,String location,int ticketPrice)
	{
		System.out.println("invoking protect of String, String and int");
	}
	
	public void protect(String name,String location,int ticketPrice,int noOfAnimals)
	{
		System.out.println("invoking protect of String, String, int and int ");
	}
	
	public void protect(String name,String location,int ticketPrice,int noOfAnimals,int since)
	{
		System.out.println("invoking protect of String, String, int, int and int");
	}
}
