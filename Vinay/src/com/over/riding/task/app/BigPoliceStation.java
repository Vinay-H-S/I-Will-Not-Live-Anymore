package com.over.riding.task.app;

public class BigPoliceStation extends PoliceStation{

	public void cell()
	{
		System.out.println("invoking cell of no-arg in Big Police Station...");
	}
	
	public void cell(String area)
	{
		System.out.println("invoking cell of String in Big Police Station..");
	}
	
	public void cell(String area,int noOfCon)
	{
		System.out.println("invoking cell of Strign and int in Big Police Station..");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle)
	{
		System.out.println("invoking cell of String, int and int in Big Police Station...");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle,int noOfCells)
	{
		System.out.println("invoking cell of String, int, int and int in Big Police Station");
	}
	
	public void cell(String area,int noOfCon,int noOfVechicle,int noOfCells,String since)
	{
		System.out.println("invoking cell of String , int, int, int and String in Big Police Station.. ");
	}
}
