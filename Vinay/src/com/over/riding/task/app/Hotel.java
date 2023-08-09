package com.over.riding.task.app;

public class Hotel {

	public String name;
	public String location;
	public boolean type;
	public int noOfWorkers;
	public String owner;
	
	public void fiveStar()
	{
		System.out.println("invoking five star of no-arg..");
	}
	
	public void fiveStar(String name)
	{
		System.out.println("invoking five star of String..");
	}
	
	public void fiveStar(String name,String location)
	{
		System.out.println("invoking five star of String and String..");
	}
	
	public void fiveStar(String name,String location,boolean type)
	{
		System.out.println("invoking five star of String, String and boolean..");
	}
	
	public void fiveStar(String name,String location,boolean type,int noOfWorkers)
	{
		System.out.println("invoking five star of String, String, boolean and int..");
	}
	
	public void fiveStar(String name,String location,boolean type,int noOfWorkers,String owner)
	{
		System.out.println("invoking five star of String, String, boolean, int and String..");
	}
	
}
