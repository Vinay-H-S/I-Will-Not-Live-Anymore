package com.over.riding.task.app;

public class GovtHospital extends Hospital{

	public void care()
	{
		System.out.println("invoking care of no-arg in Government Hospital...");
	}
	
	public void care(String name)
	{
		System.out.println("invoking care of String in Government Hospital...");
	}
	
	public void care(String name,String owner)
	{
		System.out.println("invoking care of String and String in Government Hospital...");
	}
	
	public void care(String name,String owner,int noOfWards)
	{
		System.out.println("invoking care of String, String and int in Government Hospital...");
	}
	
	public void care(String name,String owner,int noOfWards,int noOfNurse)
	{
		System.out.println("invoking care of String, String, int and int in Government Hospital...");
	}
	
	public void care(String name,String owner,int noOfWards,int noOfNurse,String type)
	{
		System.out.println("invoking care of String, String, int, int and String in Government Hospital...");
	}
}
