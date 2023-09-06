package com.xworkz.crud.boot;

import com.xworkz.artist.app.repository.TrainNoRepositoryimpl;
import com.xworkz.crud.app.repository.*;
import com.xworkz.crud.app.service.*;

public class AllRunner {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("--------------------LOCATION---------------");
		System.out.println("\n");
		
		LocationRepository locationRepository=new LocationRepositoryimpl();
		
		LocationService locationService=new LocationServiceimpl(locationRepository);
		locationService.validateAndSave("Shivamogga");
		locationService.validateAndSave("Davanagere");
		locationService.validateAndSave("Chikkamangaluru");
		locationService.validateAndSave("Banglore");
		locationService.validateAndSave("Bhadravathi");
		locationService.validateAndSave("Bhadravathi");

		
		System.out.println("\n");
		System.out.println("--------------------COUNTRY---------------");
		System.out.println("\n");
		
		CountryRepository countryRepository=new CountryRepositoryimpl();
		
		CountryService countryService=new CountryServiceimpl(countryRepository);
		countryService.validateAndSave("India");
		countryService.validateAndSave("United Kingdom");
		countryService.validateAndSave("United states");
		countryService.validateAndSave("UAE");
		countryService.validateAndSave("France");
		countryService.validateAndSave("France");
		
		System.out.println("\n");
		System.out.println("--------------------PINCODE---------------");
		System.out.println("\n");
		
		PincodeRepository pincodeRepository=new PincodeRepositoryimpl();
		
		PincodeService pincodeService=new PincodeServiceimpl(pincodeRepository);
		pincodeService.validateAndSave(577243);
		pincodeService.validateAndSave(577204);
		pincodeService.validateAndSave(577132);
		pincodeService.validateAndSave(577134);
		pincodeService.validateAndSave(577123);
		pincodeService.validateAndSave(577123);


		System.out.println("\n");
		System.out.println("--------------------TRAIN-NUMBER---------------");
		System.out.println("\n");
		
		TrainNoRepository tarinNoRepositoryimpl=new TrainNoRepositoryimpl();
		
		TrainNoService trainNoService=new TrainNoServiceimpl(tarinNoRepositoryimpl);
		trainNoService.validateAndSave(11013);
		trainNoService.validateAndSave(12785);
		trainNoService.validateAndSave(16525);
		trainNoService.validateAndSave(12654);
		trainNoService.validateAndSave(16323);
		trainNoService.validateAndSave(11013);


		System.out.println("\n");
		System.out.println("--------------------MOBILE-NUMBER---------------");
		System.out.println("\n");
		
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryimpl();
		
		MobileNoService mobileNoService=new MobileNoServiceimpl(mobileNoRepository);
		mobileNoService.validateAndSave(9481904948L);
		mobileNoService.validateAndSave(8310308343L);
		mobileNoService.validateAndSave(9483115082L);
		mobileNoService.validateAndSave(7026220424L);
		mobileNoService.validateAndSave(7259758398L);
		mobileNoService.validateAndSave(7259758398L);
		
		
		
	}

}
