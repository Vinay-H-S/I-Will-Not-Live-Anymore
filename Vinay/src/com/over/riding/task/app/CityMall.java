package com.over.riding.task.app;

public class CityMall extends Mall{

	public void floor()
	{
		System.out.println("invoking floor of no-arg in City Mall..");
	}
	
	public void floor(String name)
	{
		System.out.println("invoking floor of String in City Mall..");
	}
	
	public void floor(String name,int founded)
	{
		System.out.println("invoking floor of String and int in City Mall..");
	}
	
	public void floor(String name,int founded,int noOFLocation)
	{
		System.out.println("invoking floor of String, int and int in City Mall..");
	}
	
	public void floor(String name,int founded,int noOFLocation,double noOfEmployes)
	{
		System.out.println("invoking floor of String, int, int and double in City Mall..");
	}
	
	public void floor(String name,int founded,int noOFLocation,double noOfEmployes,String location)
	{
		System.out.println("invoking floor of String, int, int, double and String in City Mall..");
	}
}
