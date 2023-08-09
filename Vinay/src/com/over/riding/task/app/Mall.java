package com.over.riding.task.app;

public class Mall {

	public String name;
	public int founded;
	public int noOfLocation;
	public double noOfEmployes;
	public String location;
	
	public void floor()
	{
		System.out.println("invoking floor of no-arg..");
	}
	
	public void floor(String name)
	{
		System.out.println("invoking floor of String..");
	}
	
	public void floor(String name,int founded)
	{
		System.out.println("invoking floor of String and int..");
	}
	
	public void floor(String name,int founded,int noOFLocation)
	{
		System.out.println("invoking floor of String, int and int..");
	}
	
	public void floor(String name,int founded,int noOFLocation,double noOfEmployes)
	{
		System.out.println("invoking floor of String, int, int and double..");
	}
	
	public void floor(String name,int founded,int noOFLocation,double noOfEmployes,String location)
	{
		System.out.println("invoking floor of String, int, int, double and String..");
	}
}
