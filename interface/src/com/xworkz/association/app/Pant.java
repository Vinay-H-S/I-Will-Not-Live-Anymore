package com.xworkz.association.app;

public class Pant {

	private String brand;
	private Zip type;
	
	public Pant(String brand) {
		this.brand=brand;
	}
	
	public void setZip(Zip type)
	{
		this.type=type;
	}
	
	public void dry()
	{
		System.out.println("invoking dry in Pant...");
		this.type.loose();
	}
}
