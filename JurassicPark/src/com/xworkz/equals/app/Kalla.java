package com.xworkz.equals.app;

public class Kalla {

	private String name;
	private String location;
	private int houseNo;
	private int noOfItems;
	private boolean isHeStoleGold;
	private boolean doesHeArrestedFromPolice;
	
	public Kalla() {
	}

	public Kalla(String name, String loctaion, int houseNo, int noOfItems, boolean isHeStoleGold,
			boolean doesHeArrestedFromPolice) {
		super();
		this.name = name;
		this.location = loctaion;
		this.houseNo = houseNo;
		this.noOfItems = noOfItems;
		this.isHeStoleGold = isHeStoleGold;
		this.doesHeArrestedFromPolice = doesHeArrestedFromPolice;
	}
	
	@Override
	public String toString() {
		
		return "Name :"+name+"Location :"+location+"House Number :"+houseNo+"No Of Items :"+noOfItems+"Is He Stole Gold:"+isHeStoleGold+"Does He Arrested From Police :"+doesHeArrestedFromPolice;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("obj is equals to null.. ");
			if(obj instanceof Kalla)
			{
				System.out.println("obj is instance of Kalla..");
				Kalla kalla=(Kalla)obj;
				if(kalla.name.equals(kalla)&&kalla.isHeStoleGold==isHeStoleGold&&kalla.houseNo==houseNo&&kalla.location.equals(location)&&kalla.noOfItems==noOfItems&&kalla.doesHeArrestedFromPolice==doesHeArrestedFromPolice)
				{
					System.out.println("object and properties is same..");
				}
				else {
					System.out.println("object and properties is not same...");
				}
			}
			else
			{
				System.out.println("obj is not of Kalla..");
			}
		}
		else
		{
			System.out.println("obj is not equals to null..");
		}
		return false;
	}
}
