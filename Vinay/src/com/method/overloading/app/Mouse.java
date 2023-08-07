package com.method.overloading.app;

public class Mouse {

	public String brand;
	public int resolution;
	
	public void point()
	{
		System.out.println("invoking point ofn no-arg..");
		point("Logitech");
		point(1200);
	}
	
	public void point(String brand)
	{
		System.out.println("invoking point of String...");
		System.out.println("Brand : "+brand);
	}
	
	public void point(int resolution)
	{
		System.out.println("invoking point of int..");
		System.out.println("Resolution : "+resolution );
	}
	
	public void point(String brand,int resolution)
	{
		point(brand);
		point(resolution);
	}
}
