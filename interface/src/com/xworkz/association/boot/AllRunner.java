package com.xworkz.association.boot;

import com.xworkz.association.app.*;;


public class AllRunner {


	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("---------------SHIRT-BUTTON----------------");
		System.out.println("\n");
		
		String brand="Puma";
		System.out.println("Brand :"+brand);
		
		Button button=new Button();
		
		Shirt shirt=new Shirt(brand);
		shirt.setButton(button);
		
		System.out.println("\n");
		System.out.println("---------------PANT-ZIP----------------");
		System.out.println("\n");
		
		Zip zip=new Zip();

		Pant pant=new Pant("Flying Machine");
		System.out.println(pant);
		pant.setZip(zip);
		
		System.out.println("\n");
		System.out.println("---------------MOBILE-CHARGER----------------");
		System.out.println("\n");
		
		Charger charger=new Charger();
		
		Mobile mobile=new Mobile("Apple");
		mobile.setChargeSpeed(charger);
		System.out.println(mobile);
		
		System.out.println("\n");
		System.out.println("---------------PASSENGER-BUS----------------");
		System.out.println("\n");
		
		Bus bus=new Bus();
		
		Passenger passenger=new Passenger("Harshith Kumar");
		passenger.setNo(bus);
		System.out.println(bus);
		
		System.out.println("\n");
		System.out.println("---------------TRAINER-LAPTOP----------------");
		System.out.println("\n");
		
		Laptop laptop=new Laptop();
		
		Trainer trainer=new Trainer("Om");
		trainer.setBrand(laptop);
		System.out.println(laptop);
		
		System.out.println("\n");
		System.out.println("---------------WOOD-PAPER----------------");
		System.out.println("\n");
		
		Paper paper=new Paper();
		
		Wood wood=new Wood("Sandal Wood");
		wood.setQuality(paper);
		System.out.println(paper);
		
		
	}

}
