package com.inheritance.chaining.app;

public class GoldenJublieDiamond extends Diamond{
	
	public GoldenJublieDiamond()
	{
		this("Cullinan","Colorless",6000,2);
		System.out.println("No-arg const of Golden Jublie Diamond..");
	}
	
	public GoldenJublieDiamond(String brand,String type,double prize,int carat)
	{
		super(brand,type,prize,carat);
		System.out.println("All-arg const of Golden Jublie Diamond...");
	}

}
