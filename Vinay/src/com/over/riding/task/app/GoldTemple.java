package com.over.riding.task.app;

public class GoldTemple extends Temple {

	public void god()
	{
		System.out.println("invoking god of no-arg in Gold Temple..");
	}
	
	public void god(String name)
	{
		System.out.println("invoking god of String in Gold Temple..");
	}
	
	public void god(String name,String location)
	{
		System.out.println("invoking god of String and String in Gold Temple..");
	}
	
	public void god(String name,String location,int noOfGates)
	{
		System.out.println("invoking god of String, String and int in Gold Temple..");
	}
	
	public void god(String name,String location,int noOfGates,int noOfDoors)
	{
		System.out.println("invoking god of String, String, int and int in Gold Temple..");
	}
	
	public void god(String name,String location,int noOfGates,int noOfDoors,int since)
	{
		System.out.println("invoking god of String, String, int, int and int in Gold Temple..");
	}
}
