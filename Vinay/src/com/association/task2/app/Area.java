package com.association.task2.app;

public class Area {
public String name;
public Corporator corporator;

public Area(String name,Corporator corporator)
{
	this.name=name;
	this.corporator=corporator;
}

public void displayInfo()
{
	System.out.println("Area Name :"+name);
	corporator.dipplayInfo();

}


}
