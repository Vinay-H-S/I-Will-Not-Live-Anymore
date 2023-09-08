package com.xworkz.weather.app.service;

import com.xworkz.weather.app.dto.WeatherDTO;
import com.xworkz.weather.app.repository.WeatherRepository;

public class WeatherServiceimpl implements WeatherService{
	
	private WeatherRepository weatherRepository;
	
	public WeatherServiceimpl(WeatherRepository weatherRepository)
	{
		this.weatherRepository=weatherRepository;
	}
	
	public boolean validateAndSave(WeatherDTO dto)
	{
		System.out.println("running validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid..");
			String place=dto.getPlace();
			int temperature=dto.getTemperature();
			boolean rainy=dto.getRainy();
			if(place!=null)
			{
				System.out.println("Place name is valid, can save..");
			}
			else
			{
				System.err.println("Place name is invalid, cannot save..");
			}
			if(temperature!=0)
			{
				System.out.println("Temperature is valid, can save..");
			}
			else {
				System.err.println("Temperature is invalid, cannot save..");
			}
			if(rainy!=false)
			{
				System.out.println("it will rain today..");
			}
			else
			{
				System.err.println("it will not rain today..");
			}
			this.weatherRepository.save(dto);
		}
		else
		{
			System.err.println("Dto is invalid, cannot save..");
		}
		
		return false;
	}

}
