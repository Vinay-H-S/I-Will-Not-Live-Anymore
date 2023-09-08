package com.xworkz.weather.app.runner;

import com.xworkz.weather.app.dto.WeatherDTO;
import com.xworkz.weather.app.repository.WeatherRepository;
import com.xworkz.weather.app.repository.WeatherRepositoryimpl;
import com.xworkz.weather.app.service.WeatherService;
import com.xworkz.weather.app.service.WeatherServiceimpl;

public class WeatherRunner {

	public static void main(String[] args) {
		
		WeatherRepository repository=new WeatherRepositoryimpl();
		
		WeatherService service=new WeatherServiceimpl(repository);
		
		WeatherDTO dto=new WeatherDTO("Shivamogga",45,true);
		service.validateAndSave(dto);

	}

}
