package com.association.task.app;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;

	public Company(String name, String ceo, String originCountry) {
		this.name = name;
		this.ceo = ceo;
		this.originCountry = originCountry;
	}

	public void displayInfo() {
		System.out.println("Company Name :" + this.name);
		System.out.println("CEO :" + this.ceo);
		System.out.println("Origin Country :" + this.originCountry);
		
	}

}
