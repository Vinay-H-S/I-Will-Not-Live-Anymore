package com.over.riding.task.app;

public class Pub {

	public String name;
	public int noOfGates;
	public int noOfDoors;
	public boolean above18;
	public String location;
	
	public void party()
	{
		System.out.println("invoking party of no-arg..");
	}
	
	public void party(String name)
	{
		System.out.println("invoking party of String..");
	}
	
	public void party(String name,int noOfGates)
	{
		System.out.println("invoking party of String and int...");
	}
	
	public void party(String name,int noOfGates,int noOfDoors)
	{
		System.out.println("invoking party of String, int and int..");
	}
	
	public void party(String name,int noOfGates,int noOfDoors,boolean above18)
	{
		System.out.println("invoking party of String, int, int and boolean..");
	}
	
	public void party(String name,int noOfGates,int noOfDoors,boolean above18,String location)
	{
		System.out.println("invoking party of String, int, int, boolean and String..");
	}
}
