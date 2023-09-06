package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;

public class CountryServiceimpl implements CountryService{

	private CountryRepository countryRepository;
	
	public CountryServiceimpl(CountryRepository countryRepository) {
		this.countryRepository=countryRepository;
	}
	
	@Override
	public boolean validateAndSave(String country) {
		System.out.println("invoking validate and save in "+this.getClass().getSimpleName());
		if (country != null && !country.isEmpty() && country.length() >= 3 && country.length() <= 20) {
			System.out.println("Stored juice is valid ");
			if(!this.countryRepository.isExist(country))
			{
			this.countryRepository.save(country);
			return true;
			}
			else
			{
				System.err.println("country name is already exist..");
			}
		} else {
			System.err.println("Stored valid is invalid, cannot save..");
		}
		return false;
	}

}

