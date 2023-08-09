package com.over.riding.task.app;

public class OldZoo extends Zoo{

	
	public void protect()
	{
		System.out.println("invoking protect of no-arg in Old Zoo..");
	}
	
	public void protect(String name)
	{
		System.out.println("invoking protect of String in Old Zoo..");
	}
	
	public void protect(String name,String location)
	{
		System.out.println("invoking protect of String and String in Old Zoo..");
	}
	
	public void protect(String name,String location,int ticketPrice)
	{
		System.out.println("invoking protect of String, String and int in Old Zoo..");
	}
	
	public void protect(String name,String location,int ticketPrice,int noOfAnimals)
	{
		System.out.println("invoking protect of String, String, int and int in Old Zoo..");
	}
	
	public void protect(String name,String location,int ticketPrice,int noOfAnimals,int since)
	{
		System.out.println("invoking protect of String, String, int, int and int in Old Zoo..");
	}
}
