package com.over.riding.task.app;

public class StandardTheater extends Theater{

	public void movie()
	{
		System.out.println("invoking movie of no-arg in Standard Theater..");
	}
	
	public void movie(String name)
	{
		System.out.println("invoking movie of String in Standard Theater..");
	}
	
	public void movie(String name,int noOfScreen)
	{
		System.out.println("invoking movie of String and int in Standard Theater..");
	}
	
	public void movie(String name,int noOfscreen,String location)
	{
		System.out.println("invoking movie of String, int and String in Standard Theater..");
	}
	
	public void movie(String name,int noOfScreen,String location,int ticketCounter)
	{
		System.out.println("invoking movie of String, int, String and int in Standard Theater..");
	}
	
	public void movie(String name,int noOfScreen,String location,int ticketCounter,double pricePerTicket)
	{
		System.out.println("invoking movie of String, int String, int and double in Standard Theater..");
	}
}
