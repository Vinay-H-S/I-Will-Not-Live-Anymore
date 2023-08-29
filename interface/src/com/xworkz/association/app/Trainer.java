package com.xworkz.association.app;

public class Trainer {

	private String name;
	private Laptop brand;
	
	public Trainer(String name) {
		this.name=name;
	}
	
	public void setBrand(Laptop brand)
	{
		this.brand=brand;
	}
	
	public void patience() {
		System.out.println("invoking patience in Trainer..");
		this.brand.work();
	}
}
