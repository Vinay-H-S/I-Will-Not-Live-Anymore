package com.over.riding.task.app;

public class Street {

	public String name;
	public double feet;
	public double cost;
	public String constructionCompany;
	public int since;
	
	public void road()
	{
		System.out.println("invoking road of no-arg ...");
	}
	
	public void road(String name)
	{
		System.out.println("invoking road of String...");
	}
	
	public void road(String name,double feet)
	{
		System.out.println("invoking road of String and double...");
	}
	
	public void road(String name,double feet,double cost)
	{
		System.out.println("invoking road of String, double and double...");
	}
	
	public void road(String name,double feet,double cost,String constructionCompany)
	{
		System.out.println("invoking road of String, double, double and String...");
	}
	
	public void road(String name,double feet,double cost,String constructionCompany,int since)
	{
		System.out.println("invoking road of String, double, double, String and int...");
	}
}
