package com.association.task2.app;

public class HomeTown {
public String name;
public int pinCode;
public Area[] area;

public HomeTown(String name,int pinCode,Area[] area)
{
	this.name=name;
	this.pinCode=pinCode;
	this.area=area;
}

public void displayInfo()
{
	System.out.println("Home Town :"+name);
	System.out.println("Pincode :"+pinCode);
	System.out.println("^^^^^^^^^^^^^^^^");
	
	for(int town=0;town<this.area.length;town++)
	{
		Area ref=this.area[town];
		ref.displayInfo();
	}
}
}
