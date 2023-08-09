package com.over.riding.task.app;

public class Hostel {

	public String name;
	public String location;
	public int noOfWardens;
	public int noOfRooms;
	public double fee;
	
	public void jail()
	{
		System.out.println("invoking jail of no-arg...");
	}
	
	public void jail(String name)
	{
		System.out.println("invoking jail of String...");
	}
	
	public void jail(String name,String location)
	{
		System.out.println("invoking jail of String and String...");
	}
	
	public void jail(String name,String location,int noOfWardens)
	{
		System.out.println("invoking jail of String, String and int...");
	}
	
	public void jail(String name,String location,int noOfWardens,int noOfRooms)
	{
		System.out.println("invoking jail of String, String, int and int...");
	}
	
	public void jail(String name,String location,int noOfWardens,int noOfRooms,double fee)
	{
		System.out.println("invoking jail of String, String, int, int and double...");
	}
}
