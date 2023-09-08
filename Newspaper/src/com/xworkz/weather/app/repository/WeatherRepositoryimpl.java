package com.xworkz.weather.app.repository;

import com.xworkz.weather.app.dto.WeatherDTO;

public class WeatherRepositoryimpl implements WeatherRepository{
	
	private WeatherDTO dtos[]=new WeatherDTO[TOTAL_ITEM];
	private int increment;
	
	@Override
	public void save(WeatherDTO dto)
	{
		System.out.println("running dto in "+this.getClass().getSimpleName());
		if(increment<TOTAL_ITEM)
		{
			this.dtos[increment]=dto;
			System.out.println(dto+" is can be save..");
			this.increment++;
		}
		else
		{
			System.err.println("Dto is cannot be save... ");
		}
	}

}
