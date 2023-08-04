package com.inheritance.chaining.app;

public class PureGold extends Gold {

	public PureGold()
	{
		this("916",5600,"MMTC-PAMP india pvt ltd",true);
		System.out.println("No-arg const of Pure Gold..");
	}
	
	public PureGold(String name,double prize,String soldBy,boolean purest)
	{
		super(name,prize,soldBy,purest);
		System.out.println("All-arg const of Pure Gold..");
	}
	
}
