package com.xworkz.association.app;

public class Wood {

	private String name;
	private Paper quality;
	
	public Wood(String name) {
		this.name=name;
	}
	
	public void setQuality(Paper quality)
	{
		this.quality=quality;
	}
	
	public void cut()
	{
		System.out.println("invoking cut in wood...");
	}
}
