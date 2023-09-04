package com.xworkz.moon.app.service;

import com.xworkz.historicalplaces.app.repository.HistoricalPlacesRepository;

public class HistoricalPlacesServiceimpl implements HistoricalPlacesService{
	
	private HistoricalPlacesRepository historicalPlacesRepository;
	
	public HistoricalPlacesServiceimpl(HistoricalPlacesRepository historicalPlacesRepository) {
		this.historicalPlacesRepository=historicalPlacesRepository;
	}
	
	@Override
	public boolean venue(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Historical Places names is valid..");
			this.historicalPlacesRepository.venue(names);
		}
		else
		{
			System.err.println("Historical Places names is invalid, cannot save..");
		}
		return false;
	}

}
