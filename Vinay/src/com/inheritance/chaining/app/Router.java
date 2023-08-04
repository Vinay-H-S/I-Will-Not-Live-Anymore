package com.inheritance.chaining.app;

public class Router {
	public String brand;
	public String frequencyBandClass;
	public int warranty;
	public double prize;
	
	public Router(String brand,String frequencyBandClass,int warranty,double prize)
	{
		this.brand=brand;
		this.frequencyBandClass=frequencyBandClass;
		this.warranty=warranty;
		this.prize=prize;
		System.out.println("all-arg const of Router...");
		
	}
	
	

}
