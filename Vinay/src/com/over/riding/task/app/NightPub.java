package com.over.riding.task.app;

public class NightPub extends Pub{

	public void party()
	{
		System.out.println("invoking party of no-arg in Night Pub..");
	}
	
	public void party(String name)
	{
		System.out.println("invoking party of String in Night Pub..");
	}
	
	public void party(String name,int noOfGates)
	{
		System.out.println("invoking party of String and int in Night Pub...");
	}
	
	public void party(String name,int noOfGates,int noOfDoors)
	{
		System.out.println("invoking party of String, int and int in Night Pub..");
	}
	
	public void party(String name,int noOfGates,int noOfDoors,boolean above18)
	{
		System.out.println("invoking party of String, int, int and boolean in Night Pub..");
	}
	
	public void party(String name,int noOfGates,int noOfDoors,boolean above18,String location)
	{
		System.out.println("invoking party of String, int, int, boolean and String in Night Pub..");
	}
}
