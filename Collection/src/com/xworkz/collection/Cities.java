package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {

	public static void main(String[] args) {
		Collection<String> cities = new ArrayList<String>();
		cities.add("Bangalore");
		cities.add("Mysore");
		cities.add("Hubli");
		cities.add("Dharwad ");
		cities.add("Mangalore");
		cities.add("Belgaum");
		cities.add("Gulbarga");
		cities.add("Davangere");
		cities.add("Bellary");
		cities.add("Shimoga");
		cities.add("Tumkur ");
		cities.add("Udupi");
		cities.add("Bidar ");
		cities.add("Raichur");
		cities.add("Hospet");
		cities.add("Hassan");
		cities.add("Chitradur");
		cities.add("Chikmagal");
		cities.add("Bagalkot ");
		cities.add("Hampi");
		System.out.println("Total Cities :" + cities.size());
		
		Iterator<String> city = cities.iterator();
		while (city.hasNext()) {
			String names = city.next();
			System.out.println(names + ": City");
		}
	}
}
