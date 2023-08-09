package com.over.riding.task.app;

public class RajStreet extends Street{

	public void road()
	{
		System.out.println("invoking road of no-arg in Raj Street...");
	}
	
	public void road(String name)
	{
		System.out.println("invoking road of String in Raj Street...");
	}
	
	public void road(String name,double feet)
	{
		System.out.println("invoking road of String and double in Raj Street...");
	}
	
	public void road(String name,double feet,double cost)
	{
		System.out.println("invoking road of String, double and double in Raj Street...");
	}
	
	public void road(String name,double feet,double cost,String constructionCompany)
	{
		System.out.println("invoking road of String, double, double and String in Raj Street...");
	}
	
	public void road(String name,double feet,double cost,String constructionCompany,int since)
	{
		System.out.println("invoking road of String, double, double, String and int in Raj Street...");
	}
}
