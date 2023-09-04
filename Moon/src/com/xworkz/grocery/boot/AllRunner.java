package com.xworkz.grocery.boot;

import com.xworkz.Politician.app.repository.PoliticianRepository;
import com.xworkz.Politician.app.repository.PoliticianRepositoryimpl;
import com.xworkz.artist.app.repository.*;
import com.xworkz.grocery.app.repository.*;
import com.xworkz.historicalplaces.app.repository.*;
import com.xworkz.medicine.app.repository.*;
import com.xworkz.moon.app.service.*;
import com.xworkz.patient.repository.PatientRepository;
import com.xworkz.patient.repository.PatientRepositoryimpl;
import com.xworkz.pilot.app.repository.PilotRepository;
import com.xworkz.pilot.app.repository.PilotRepositoryimpl;
import com.xworkz.moon.app.service.*;


public class AllRunner {

	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("----------------------GROCERY-SERVICE-----------");
		System.out.println("\n");
	
		GroceryRepository groceryRepository=new GroceryRepositoryimpl();
		
		GroceryService service=new GroceryServiceimpl(groceryRepository);
		service.save("Sugar");
		service.save("Chilli");
		service.save("Milk Powder");
		service.save("Oil");
		service.save("Toothpaste");
		service.save("Detergent");
		service.save("Chicken Masala Powder");
		service.save("Matton Masala Powder");
		service.save("Rasam Powder");
		service.save("Egg");
		service.save("Sugar");
		
		System.out.println("\n");
		System.out.println("----------------------ARTIST-SERVICE-----------");
		System.out.println("\n");
		
		ArtistRepository artistRepository=new ArtistRepositoryimpl();
		
		ArtistService artist=new ArtistServiceimpl(artistRepository);
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
		System.out.println("----------------------HISTORICAL PLACES-SERVICE-----------");
		System.out.println("\n");
		
		HistoricalPlacesRepository historicalPlacesRepository=new HistoricalPlacesRepository();
		
		HistoricalPlacesService place=new HistoricalPlacesServiceimpl(historicalPlacesRepository);
		
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
		System.out.println("-------------------MEDICINE-SERVICE-------------------");
		System.out.println("\n");
		
		MedicineRepository medicineRepository=new MedicineRepositoryimpl();
		
		MedicineService medicine=new MedicineServiceimpl(medicineRepository); 
		medicine.list("Naproxen");
		medicine.list("Aspirin");
		medicine.list("Diazepen");
		medicine.list("Ativan");
		medicine.list("Dolo-650");
		medicine.list("Lisinopril");
		medicine.list("Dexamenthose");
		medicine.list("Atvin");
		medicine.list("Doxycycline");
		medicine.list("");
		medicine.list("Naproxen");
		medicine.list("Abacavir");
		
		System.out.println("\n");
		System.out.println("-------------------PATIENT-------------------");
		System.out.println("\n");
		
		
		
		PatientRepository patientRepository=new PatientRepositoryimpl();
		
		PatientService patient=new PatientServiceimpl(patientRepository);
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
		patient.care(null);
		
		System.out.println("\n");
		System.out.println("-------------------POLITICIAN-SERVICE-------------------");
		System.out.println("\n");

		
		PoliticianRepository politicianRepository=new PoliticianRepositoryimpl();
		
		PoliticianService politician=new PoliticianServiceimpl(politicianRepository);
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
		politician.list(null);
		
		System.out.println("\n");
		System.out.println("-------------------PILOT-SERVICE-------------------");
		System.out.println("\n");
		
		PilotRepository pilotRepository=new PilotRepositoryimpl();
		
		PilotService pilot=new PilotServiceimpl(pilotRepository);
		
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
		pilot.list(null);
		
	}

}
