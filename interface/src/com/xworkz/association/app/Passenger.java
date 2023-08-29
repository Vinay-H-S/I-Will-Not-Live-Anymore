package com.xworkz.association.app;

public class Passenger {

	private String name;
	private Bus no;
	
	public Passenger(String name) {
		this.name=name;
	}
	
	public void setNo(Bus no)
	{
		this.no=no;
	}
	
	public void ticket()
	{
		System.out.println("invoking ticket in Passenger...");
		this.no.drive();
	}
}
