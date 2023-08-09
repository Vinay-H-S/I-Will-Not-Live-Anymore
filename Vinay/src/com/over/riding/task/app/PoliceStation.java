package com.over.riding.task.app;

public class PoliceStation {

	public String area;
	public int noOfCon;
	public int noOfVechicle;
	public int noOfCells;
	public String since;
	
	public void cell()
	{
		System.out.println("invoking cell of no-arg...");
	}
	
	public void cell(String area)
	{
		System.out.println("invoking cell of String..");
	}
	
	public void cell(String area,int noOfCon)
	{
		System.out.println("invoking cell of Strign and int..");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle)
	{
		System.out.println("invoking cell of String, int and int...");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle,int noOfCells)
	{
		System.out.println("invoking cell of String, int, int and int");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle,int noOfCells,String since)
	{
		System.out.println("invoking cell of String , int, int, int and String.. ");
	}
}
