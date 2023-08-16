package com.xworkz.task.app;

public class Kerchief {

	private String brand;
	private String clothType;
	private double price;
	private boolean washable;
	private String kerchiefType;
	private char size;
	private String manufacturer;
	
	public Kerchief() {

	}

	public Kerchief(String brand, String clothType, double price, boolean washable, String kerchiefType, char size,
			String manufacturer) {
		super();
		this.brand = brand;
		this.clothType = clothType;
		this.price = price;
		this.washable = washable;
		this.kerchiefType = kerchiefType;
		this.size = size;
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Brand :"+brand+"Cloth Type :"+clothType+"Price :"+price+"Washable :"+washable+"Kerchief Type :"+kerchiefType+"Size :"+size+"Manufacturer :"+manufacturer;
	}
}
