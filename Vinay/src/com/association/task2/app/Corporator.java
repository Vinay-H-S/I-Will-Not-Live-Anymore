package com.association.task2.app;

public class Corporator {
public String name;
public Building[] building;

public Corporator(String name,Building[] building)
{
	this.name=name;
	this.building=building;
}

public void dipplayInfo()
{
	System.out.println("corporator Name :"+name);
	for(int build=0;build<this.building.length;build++)
	{
		Building ref=this.building[build];
		ref.displayInfo();
		
	}
}
}
