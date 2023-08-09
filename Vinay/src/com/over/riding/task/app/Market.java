package com.over.riding.task.app;

public class Market {

	public String name;
	public String location;
	public int noOfTents;
	public boolean fresh;
	public double cost;
	
	public void sell()
	{
		System.out.println("invoking sell of no-arg...");
	}
	
	public void sell(String name)
	{
		System.out.println("invoking sell of String...");
	}
	
	public void sell(String name,String location)
	{
		System.out.println("invoking sell of String and String...");
	}
	
	public void sell(String name,String location,int noOfTents)
	{
		System.out.println("invoking sell of String, String and int...");
	}
	
	public void sell(String name,String location,int noOfTents,boolean fresh)
	{
		System.out.println("invoking sell of String, String, int and boolean...");
	}
	
	public void sell(String name,String location,int noOfTents,boolean fresh,double cost)
	{
		System.out.println("invoking sell of String, String, int, boolean and double...");
	}
}
