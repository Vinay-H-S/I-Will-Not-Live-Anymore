package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable{
	
	private String name;
	private String lng;
	private double cost;
	
	public NewspaperDTO() {
		
	}
	
	
	public NewspaperDTO(String name, String lng, double cost) {
		super();
		this.name = name;
		this.lng = lng;
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "NewspaperDTO [name=" + name + ", lng=" + lng + ", cost=" + cost + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
