package com.xworkz.task.boot;

public class Flag {

	private String country;
	private int noOfColors;
	private String clothMaterial;
	
	public Flag() {
	}

	public Flag(String country, int noOfColors, String clothMaterial) {
		super();
		this.country = country;
		this.noOfColors = noOfColors;
		this.clothMaterial = clothMaterial;
	}
	
	@Override
	public String toString() {
		return "Country :"+country   +"No Of Colors In Flag :"+noOfColors+"Cloth Material :"+clothMaterial;
	}
}
