package com.association.task2.app;

public class Player {
public String name;
public int exp;
public HomeTown town;
public Building building;

public Player(Building building,String name,int exp,HomeTown town)
{
	this.building=building;
	this.name=name;
	this.exp=exp;
	this.town=town;
}
public void displayInfo()
{
	System.out.println("Player Name :"+name);
	System.out.println("Experience :"+exp);
	building.displayInfo();
	town.displayInfo();
}
}
