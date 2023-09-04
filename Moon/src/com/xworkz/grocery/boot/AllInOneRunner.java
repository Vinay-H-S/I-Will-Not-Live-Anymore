package com.xworkz.grocery.boot;

import com.xworkz.Jacket.app.Repository.JacketRepository;
import com.xworkz.Jacket.app.Repository.JacketRepositoryimpl;
import com.xworkz.Politician.app.repository.PoliticianRepository;
import com.xworkz.Politician.app.repository.PoliticianRepositoryimpl;
import com.xworkz.artist.app.repository.ArtistRepository;
import com.xworkz.artist.app.repository.ArtistRepositoryimpl;
import com.xworkz.grocery.app.repository.*;
import com.xworkz.historicalplaces.app.repository.HistoricalPlaces;
import com.xworkz.historicalplaces.app.repository.HistoricalPlacesRepository;
import com.xworkz.medicine.app.repository.MedicineRepository;
import com.xworkz.medicine.app.repository.MedicineRepositoryimpl;
import com.xworkz.moon.app.service.MedicineService;
import com.xworkz.moon.app.service.MedicineServiceimpl;
import com.xworkz.patient.repository.PatientRepository;
import com.xworkz.patient.repository.PatientRepositoryimpl;
import com.xworkz.pilot.app.repository.PilotRepository;
import com.xworkz.pilot.app.repository.PilotRepositoryimpl;

public class AllInOneRunner {

	
	public static void main(String[] args) {

		System.out.println("-------------------GROCERY-------------------");
		System.out.println("\n");
		
		GroceryRepository repo=new GroceryRepositoryimpl();
		repo.save("Sugar");
		repo.save("Chilli");
		repo.save("Milk Powder");
		repo.save("Oil");
		repo.save("Toothpaste");
		repo.save("Detergent");
		repo.save("Chicken Masala Powder");
		repo.save("Matton Masala Powder");
		repo.save("Rasam Powder");
		repo.save("Egg");
		repo.save("Sugar");
		
		System.out.println("\n");
		System.out.println("-------------------ARTIST-------------------");
		System.out.println("\n");
		
		ArtistRepository artist=new ArtistRepositoryimpl();
		artist.list("Amrita Sher-Gil");
		artist.list("Jamini Roy");
		artist.list("Kalipada Goshala");
		artist.list("Maniam");
		artist.list("Manishi Dey");
		artist.list("Nandalal Bose");
		artist.list("Rabindranath Tagore");
		artist.list("Silpi");
		artist.list("Sunil Das");
		artist.list("Thakur Singh");
		artist.list("Thakur Singh");
		
		System.out.println("\n");
		System.out.println("-------------------JACKET-------------------");
		System.out.println("\n");

		JacketRepository jacket=new JacketRepositoryimpl();
		jacket.priceList(1265);
		jacket.priceList(2561);
		jacket.priceList(7856);
		jacket.priceList(5412);
		jacket.priceList(4521);
		jacket.priceList(2666);
		jacket.priceList(1800);
		jacket.priceList(7903);
		jacket.priceList(4999);
		jacket.priceList(3212);
		jacket.priceList(1265);
		
		System.out.println("\n");
		System.out.println("-------------------PATIENT-------------------");
		System.out.println("\n");
		
		PatientRepository patient=new PatientRepositoryimpl();
		patient.care("Harshith Kumar");
		patient.care("Jeevan K");
		patient.care("Sagar K");
		patient.care("Chandru M");
		patient.care("Prajwal B");
		patient.care("Chandan V");
		patient.care("Darshan");
		patient.care("Venu Gopal");
		patient.care("Vikas S R");
		patient.care("Naveen Mokka");
		patient.care("Harshith Kumar");
		
		
		System.out.println("\n");
		System.out.println("-------------------POLITICIAN-------------------");
		System.out.println("\n");

		
		PoliticianRepository politician=new PoliticianRepositoryimpl();
		politician.list("Narendra Modi");
		politician.list("B S Y");
		politician.list("Halappa Achar");
		politician.list("Karadi Sanganna");
		politician.list("R Ashoka");
		politician.list("B N Bache Gowda");
		politician.list("G S Basavaraj");
		politician.list("K G Bopaiah");
		politician.list("Basavaraj Bommai");
		politician.list("C K Ramamurthy");
		politician.list("B S Y");
			
		
		System.out.println("\n");
		System.out.println("-------------------HISTORICAL-PLACES-------------------");
		System.out.println("\n");

		HistoricalPlaces place=new HistoricalPlacesRepository();
		place.venue("Mysore");
		place.venue("Badami");
		place.venue("Aihole");
		place.venue("Halebidu");
		place.venue("Shimoga");
		place.venue("Dandeli");
		place.venue("Hampi");
		place.venue("Srirangapatna");
		place.venue("Banglore");
		place.venue("Beluru");
		place.venue("Mysore");
		
		System.out.println("\n");
		System.out.println("-------------------PILOT-------------------");
		System.out.println("\n");
		
		PilotRepository pilot=new PilotRepositoryimpl();
		pilot.list("Ajay");
		pilot.list("Suhas Biswas");
		pilot.list("cariappa");
		pilot.list("Anil Chopra");
		pilot.list("Rana Chinna");
		pilot.list("Vinod");
		pilot.list("Srujan Das");
		pilot.list("Divakar");
		pilot.list("Kumar");
		pilot.list("Anna malie");
		pilot.list("Roman Vishal");
		
		System.out.println("\n");
		System.out.println("-------------------MEDICINE-------------------");
		System.out.println("\n");
		
		
		MedicineRepository medicine=new MedicineRepositoryimpl();
		
		medicine.list("Naproxen");
		medicine.list("Aspirin");
		medicine.list("Diazepen");
		medicine.list("Ativan");
		medicine.list("Dolo-650");
		medicine.list("Lisinopril");
		medicine.list("Dexamenthose");
		medicine.list("Atvin");
		medicine.list("Doxycycline");
		medicine.list("Abacavir");
		medicine.list("Naproxen");







	}

}
