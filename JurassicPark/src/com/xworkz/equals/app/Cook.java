package com.xworkz.equals.app;

public class Cook {

	private String itemNames;
	private String functionName;
	private int noOfItems;
	private boolean foodIsGood;
	private String battruName;
	private double price;
	
	public Cook() {
	}

	public Cook(String itemName, String functionName, int noOfItems, boolean foodIsGood, String battruName,
			double price) {
		super();
		this.itemNames = itemName;
		this.functionName = functionName;
		this.noOfItems = noOfItems;
		this.foodIsGood = foodIsGood;
		this.battruName = battruName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Item Names :"+itemNames+"Function Name :"+functionName+"No Of Items :"+noOfItems+"Food is Good :"+foodIsGood+"Battru Name :"+battruName+"Price :"+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("obj is equals to null..");
			if(obj instanceof Cook)
			{
				System.out.println("obj is instance of Cook..");
				Cook cook=(Cook)obj;
				if(cook.battruName.equals(battruName)&&cook.functionName.equals(functionName)&&cook.itemNames==itemNames&&cook.noOfItems==noOfItems&&cook.price==price)
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}
			}
			else
			{
				System.out.println("obj is not of Cook..");
			}
		}
		else
		{
			System.out.println("obj is not equals to null..");
		}
		return false;
	}
}
