package com.xworkz.weather.app.service;

import com.xworkz.weather.app.dto.WeatherDTO;

public interface WeatherService {

	boolean validateAndSave(WeatherDTO dto);
}
