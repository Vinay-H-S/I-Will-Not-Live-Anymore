package com.xworkz.weather.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable{
	
	private String place;
	private int temperature;
	private boolean rainy;
	
	public WeatherDTO()
	{
		
	}
	
	public WeatherDTO(String place,int temperature,boolean rainy)
	{
		this.place=place;
		this.temperature=temperature;
		this.rainy=rainy;
	}
	
	

	@Override
	public String toString() {
		return "WeatherDTO [place=" + place + ", temperature=" + temperature + ", rainy=" + rainy + "]";
	}

	public String getPlace()
	{
		return place;
	}
	
	public void setPlace(String place)
	{
		this.place=place;
	}
	
	public int getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(int temperature)
	{
		this.temperature=temperature;
	}
	
	public boolean getRainy()
	{
		return rainy;
	}
	
	public void setRainy(boolean rainy)
	{
		this.rainy=rainy;
	}
}
