package com.kumar.xworkz;

public class Xworkz {
	
	String name;
	String TrianerName;
	int noOfStudent;
	
	public void workz(String name,String TrinerName,int noOfStudent)
	{
		System.out.println("xworkz name is successfull");
		this.name=name;
		this.TrianerName=TrinerName;
		this.noOfStudent=noOfStudent;
	}
	
	
	public Xworkz(String name, String trianerName, int noOfStudent) {
		super();
		this.name = name;
		TrianerName = trianerName;
		this.noOfStudent = noOfStudent;
	}
	
	public static void main(String[] args) {
		
		Xworkz work=new Xworkz("harshith", "om", 100);
	}
	
	

}
