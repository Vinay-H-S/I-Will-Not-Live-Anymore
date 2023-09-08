package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.*;
import com.xworkz.crud.app.service.*;

public class AllRunner {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("--------------------LOCATION---------------");
		System.out.println("\n");
		
		LocationRepository locationRepository=new LocationRepositoryimpl();
		
		LocationService locationService=new LocationServiceimpl(locationRepository);
		String names[]= {"Anaveri","Shivamogga","Bhadravathi","N R Pura","Chikkamangluru",""};
		for(String vini:names)
		{
			locationService.validateAndSave(vini);
		}

		
		System.out.println("\n");
		System.out.println("--------------------COUNTRY---------------");
		System.out.println("\n");
		
		CountryRepository countryRepository=new CountryRepositoryimpl();
		
		CountryService countryService=new CountryServiceimpl(countryRepository);
		String name[]= {"India","America","Dubai","France","Srilanka"};
		for(String o:name)
		{
			countryService.validateAndSave(o);
		}
		
		System.out.println("\n");
		System.out.println("--------------------PINCODE---------------");
		System.out.println("\n");
		
		PincodeRepository pincodeRepository=new PincodeRepositoryimpl();
		
		PincodeService pincodeService=new PincodeServiceimpl(pincodeRepository);
		int code[]= {577243,577132,577123,577134,577789};
		for(int i:code)
		{
			pincodeRepository.list(i);
		}

		System.out.println("\n");
		System.out.println("--------------------TRAIN-NUMBER---------------");
		System.out.println("\n");
		
		TrainNoRepository tarinNoRepositoryimpl=new TrainNoRepositoryimpll();
		
		TrainNoService trainNoService=new TrainNoServiceimpl(tarinNoRepositoryimpl);
		int train[]= {15485,64555,15463,78545,54656,56265};
		for(int run:train) {
			trainNoService.validateAndSave(run);
		}

		System.out.println("\n");
		System.out.println("--------------------MOBILE-NUMBER---------------");
		System.out.println("\n");
		
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryimpl();
		
		MobileNoService mobileNoService=new MobileNoServiceimpl(mobileNoRepository);
		long cell[]= {9448316458L,7026220424L,9481362154L,7259456321L,9483110256L,9451255545L};
		for(long phone : cell)
		{
			mobileNoService.validateAndSave(phone);
		}
		
		
	}

}
