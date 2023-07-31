package com.association.task.app;

public class Toothpaste {
	public String name;
	public String brand;
	public String company;
	public Ingredent[] ingredents;

	public Toothpaste(String name, String brand, String company, Ingredent[] ingredents) {
		this.name = name;
		this.brand = brand;
		this.company = company;
		this.ingredents = ingredents;
	}

	public void dipalyInfo()
	{
		System.out.println("Toothpaste Name :"+this.name);
		System.out.println("Brand :"+this.brand);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		for (int paste = 0; paste < this.ingredents.length; paste++) 
		{
			System.out.println("Ingredients Details");
			Ingredent ref = this.ingredents[paste];
			ref.displayInfo();
		
		}

	}

}
