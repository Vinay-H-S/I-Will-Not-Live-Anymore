package com.over.riding.task.app;

public class BigMarket extends Market{

	public void sell()
	{
		System.out.println("invoking sell of no-arg in Big Market...");
	}
	
	public void sell(String name)
	{
		System.out.println("invoking sell of String in Big Market...");
	}
	
	public void sell(String name,String location)
	{
		System.out.println("invoking sell of String and String in Big Market...");
	}
	
	public void sell(String name,String location,int noOfTents)
	{
		System.out.println("invoking sell of String, String and int in Big Market...");
	}
	
	public void sell(String name,String location,int noOfTents,boolean fresh)
	{
		System.out.println("invoking sell of String, String, int and boolean in Big Market...");
	}
	
	public void sell(String name,String location,int noOfTents,boolean fresh,double cost)
	{
		System.out.println("invoking sell of String, String, int, boolean and double in Big Market...");
	}
}
