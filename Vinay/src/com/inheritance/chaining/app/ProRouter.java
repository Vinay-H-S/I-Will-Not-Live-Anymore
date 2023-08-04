package com.inheritance.chaining.app;

public class ProRouter extends Router{
	
	public ProRouter()
	{
		this("D-Link","2.4GHz",1,4600);
		System.out.println("no-arg const of ProRouter..");
		
	}
	
	public ProRouter(String brand,String frequencyBandClass,int warranty,double prize)
	{
		super(brand,frequencyBandClass,warranty,prize);
		System.out.println("all-arg const of ProRouter..");
	}

}
