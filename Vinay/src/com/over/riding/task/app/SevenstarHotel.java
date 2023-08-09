package com.over.riding.task.app;

public class SevenstarHotel extends Hotel {

	public void fiveStar()
	{
		System.out.println("invoking five star of no-arg in Five Star..");
	}
	
	public void fiveStar(String name)
	{
		System.out.println("invoking five star of String in Five Star..");
	}
	
	public void fiveStar(String name,String location)
	{
		System.out.println("invoking five star of String and String in Five Star..");
	}
	
	public void fiveStar(String name,String location,boolean type)
	{
		System.out.println("invoking five star of String, String and boolean in Five Star..");
	}
	
	public void fiveStar(String name,String location,boolean type,int noOfWorkers)
	{
		System.out.println("invoking five star of String, String, boolean and int in Five Star..");
	}
	
	public void fiveStar(String name,String location,boolean type,int noOfWorkers,String owner)
	{
		System.out.println("invoking five star of String, String, boolean, int and String in Five Star..");
	}
}
