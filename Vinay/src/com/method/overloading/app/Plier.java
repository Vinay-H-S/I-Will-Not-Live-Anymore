package com.method.overloading.app;

public class Plier {

	public String brand;
	public char size;
	
	public void tool()
	{
		System.out.println("invoking tool of no-arg...");
		tool("Taparia");
		tool('S');
	}
	
	public void tool(String brand) {
		System.out.println("invoking tool of String...");
		System.out.println("Brand Name :"+brand);
	}
	
	public void tool(char size)
	{
		System.out.println("invoking tool of char...");
		System.out.println("Size :"+size);
	}
	
	public void tool(String brand,char size)
	{
		System.out.println("invoking tool of String and Char..");
		tool(brand);
		tool(size);
	}
}
