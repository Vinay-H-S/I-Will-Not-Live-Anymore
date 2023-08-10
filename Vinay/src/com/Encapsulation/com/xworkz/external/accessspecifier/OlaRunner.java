package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class OlaRunner {

	Ola ola = new Ola();
	ola.setEmail("jeevanmoriya5@gmail.com");
	ola.setUserName("Jeevan K");
	ola.setMobileNumber(8310308343);
	ola.setCurrentLocation("Rajajinagar");
	ola.setDestinationLocation("Majestic");
	ola.setProfilePic(true);
	ola.setVehicle("Car");
	ola.setNoOfPeople(4);
	ola.setOtp(5431);
	ola.setPaymentMethod("Cash");
	ola.setVehicleNumber("KA143571");
	ola.setNoOfRides(20);
	ola.setCost(50);
	ola.setCancellationRate(20);
	
	System.out.println(ola.getEmail());
	System.out.println(ola.getUserName());
	System.out.println(ola.getMobileNumber());
	System.out.println(ola.getCurrentLocation());
	System.out.println(ola.getDestinationLocation());
	System.out.println(ola.isProfilePic());
	System.out.println(ola.getVehicle());
	System.out.println(ola.getNoOfPeople());
	System.out.println(ola.getOtp());
	System.out.println(ola.getPaymentMethod());
	System.out.println(ola.getVehicleNumber());
	System.out.println(ola.getNoOfRides());
	System.out.println(ola.getCost());
	System.out.println(ola.getCancellationRate());
}
