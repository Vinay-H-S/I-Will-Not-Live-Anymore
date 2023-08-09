package com.over.riding.task.app;

public class Hospital {
	
	public String name;
	public String owner;
	public int noOfWards;
	public int noOfNurse;
	public String type;
	
	public void care()
	{
		System.out.println("invoking care of no-arg...");
	}
	
	public void care(String name)
	{
		System.out.println("invoking care of String...");
	}
	
	public void care(String name,String owner)
	{
		System.out.println("invoking care of String and String...");
	}
	
	public void care(String name,String owner,int noOfWards)
	{
		System.out.println("invoking care of String, String and int...");
	}
	
	public void care(String name,String owner,int noOfWards,int noOfNurse)
	{
		System.out.println("invoking care of String, String, int and int...");
	}
	
	public void care(String name,String owner,int noOfWards,int noOfNurse,String type)
	{
		System.out.println("invoking care of String, String, int, int and String...");
	}
	
}
