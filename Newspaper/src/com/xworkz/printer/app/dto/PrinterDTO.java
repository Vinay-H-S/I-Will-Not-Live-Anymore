package com.xworkz.printer.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable{

	private String name;
	private boolean colorPrinter;
	private double cost;
	
	public PrinterDTO()
	{
		
	}
	
	public PrinterDTO(String name,boolean colorPrinter,double cost)
	{
		this.name=name;
		this.colorPrinter=colorPrinter;
		this.cost=cost;
	}
	
	@Override
	public String toString()
	{
		return "PrinterDTO  [Name="+ name +", Color Printer="+ colorPrinter + ", Cost=" + cost + "]";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public boolean getColorPrinter() {
		
		return colorPrinter;
	}
	
	public void setColorPrinter(boolean colorPrinter)
	{
		this.colorPrinter=colorPrinter;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost=cost;
	}
}
