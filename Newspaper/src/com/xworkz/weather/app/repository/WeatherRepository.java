package com.xworkz.weather.app.repository;

import com.xworkz.weather.app.dto.WeatherDTO;

public interface WeatherRepository {

	int TOTAL_ITEM=5;
	
	void save(WeatherDTO dto);
}
