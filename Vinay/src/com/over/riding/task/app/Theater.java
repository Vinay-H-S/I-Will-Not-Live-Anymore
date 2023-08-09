package com.over.riding.task.app;

public class Theater {

	public String name;
	public int noOfScreen;
	public String location;
	public int ticketCounter;
	public double pricePerTicket;
	
	public void movie()
	{
		System.out.println("invoking movie of no-arg..");
	}
	
	public void movie(String name)
	{
		System.out.println("invoking movie of String..");
	}
	
	public void movie(String name,int noOfScreen)
	{
		System.out.println("invoking movie of String and int..");
	}
	
	public void movie(String name,int noOfscreen,String location)
	{
		System.out.println("invoking movie of String, int and String..");
	}
	
	public void movie(String name,int noOfScreen,String location,int ticketCounter)
	{
		System.out.println("invoking movie of String, int, String and int..");
	}
	
	public void movie(String name,int noOfScreen,String location,int ticketCounter,double pricePerTicket)
	{
		System.out.println("invoking movie of String, int String, int and double..");
	}
}
