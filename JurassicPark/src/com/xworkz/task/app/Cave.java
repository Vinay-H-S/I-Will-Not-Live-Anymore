package com.xworkz.task.app;

public class Cave {

	private String name;
	private String situatedCity;
	private int noOfCaves;
	private int century;
	private int since;
	private String displayAmixOf;
	
	public Cave() {
	
	}

	public Cave(String name, String situatedCity, int noOfCaves, int century, int since, String displayAmixOf) {
		super();
		this.name = name;
		this.situatedCity = situatedCity;
		this.noOfCaves = noOfCaves;
		this.century = century;
		this.since = since;
		this.displayAmixOf = displayAmixOf;
	}
	
	@Override
	public String toString() {
		
		return "Name :"+name +"Situated :"+situatedCity + "No Of Caves :" +noOfCaves + "Century :"+century + "Since :"+since + "Display a Mix of :"+displayAmixOf;
	}
}
