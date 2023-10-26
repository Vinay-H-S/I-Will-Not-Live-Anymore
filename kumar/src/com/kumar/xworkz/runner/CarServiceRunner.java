package com.kumar.xworkz.runner;

import com.kumar.xworkz.CarService;

public class CarServiceRunner {
	
	public static void main(String[] args) {
		
		CarService service1= new CarService("Renoult", "kwid", 500000.0f, 5, 125478, 'z');
		
		
		System.out.println("carService details" + service1.toString());
		
	}

}
