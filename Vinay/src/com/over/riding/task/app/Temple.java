package com.over.riding.task.app;

public class Temple {

	public String name;
	public String location;
	public int noOfGates;
	public int noOfDoors;
	public int since;
	
	public void god()
	{
		System.out.println("invoking god of no-arg..");
	}
	
	public void god(String name)
	{
		System.out.println("invoking god of String..");
	}
	
	public void god(String name,String location)
	{
		System.out.println("invoking god of String and String..");
	}
	
	public void god(String name,String location,int noOfGates)
	{
		System.out.println("invoking god of String, String and int..");
	}
	
	public void god(String name,String location,int noOfGates,int noOfDoors)
	{
		System.out.println("invoking god of String, String, int and int..");
	}
	
	public void god(String name,String location,int noOfGates,int noOfDoors,int since)
	{
		System.out.println("invoking god of String, String, int, int and int..");
	}
}
