package com.association.task2.app;

public class Floor {
public String name;
public int no;

public Floor(String name,int no)
{
	this.name=name;
	this.no=no;
}

public void displayInfo()
{
	System.out.println("Floor Name :"+name);
	System.out.println("Floor No :"+no);
}


}
