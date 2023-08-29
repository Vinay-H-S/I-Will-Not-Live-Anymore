package com.xworkz.association.app;

public class Shirt {

	private String brand;
	private Button shape;
	
	public Shirt(String brand) {
		this.brand=brand;
	}
	
	public void setButton(Button shape) {
		this.shape=shape;
	}
	
	public void buy()
	{
		System.out.println("invoking buy in Shirt...");
		this.shape.safety();
	}
}
