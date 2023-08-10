package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class UberRunner {
	
	public static void main(String[] args) {
		
		Uber car1=new Uber();
		car1.settype("Private");
		car1.setindustry("Garret camp");
		car1.setheadquarters("San francisco");
		car1.setnoOfLoc(250);
		car1.setareaServed("india,australia,new zealand,united kingdom");
		car1.setkeyPeople("Ronald sugar,dara khosrowshahi");
		car1.setproducts("Mobile,App,Website");
		car1.setservice("Taxi,food delivery,package delivery");
		car1.setrevenue(31.88);
		car1.setnetRevenue(-1.83);
		car1.setnoOfEmployees(32800);
		car1.setwebsite("www.ubercabs.com");
		System.out.println("Type :"+car1.gettype());
		System.out.println("Industry :"+car1.getindustry());
		System.out.println("Founded :"+car1.getfounded());
		System.out.println("Founder :"+car1.getfounder());
		System.out.println("Headquarters :"+car1.getheadquarters());
		System.out.println("No of Location :"+car1.getnoOfLoc());
		System.out.println("Area Served :"+car1.getareaServed());
		System.out.println("Key people :"+car1.getkeyPeople());
		System.out.println("Products :"+car1.getproducts());
		System.out.println("Service :"+car1.getservice());
		System.out.println("Revenue :"+car1.getrevenue());
		System.out.println("Net Revenue :"+car1.getnetRevenue());
		System.out.println("No of Employees :"+car1.getnoOfEmployees());
		System.out.println("Website :"+car1.getwebsite());
	}

}
