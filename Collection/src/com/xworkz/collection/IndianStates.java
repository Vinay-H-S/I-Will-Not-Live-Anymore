package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianStates {

	public static void main(String[] args) {

		Collection<String> states = new ArrayList<String>();
		states.add("Karnataka");
		states.add("Andra Pradesh");
		states.add("Tamil Nadu");
		states.add("Bihar");
		states.add("Kerala");
		states.add("Rajasthan");
		states.add("Gujarat");
		states.add("Madhya Pradesh");
		states.add("Haryana");
		states.add("Maharashtra");
		states.add("Uttar Pradesh");
		states.add("Punjab");
		states.add("Odisha");
		states.add("Assam");
		states.add("Himchala Pradesh");
		states.add("West Bengal");
		states.add("Nagaland");
		states.add("Goa");
		states.add("Nagaland");
		states.add("Goa");
		states.add("Arunachala Pradesh");
		states.add("Sikkim");
		states.add("Jharkhand");
		states.add("Telangana");
		states.add("Tirpura");
		states.add("Mizoram");
		states.add("Chattisgarh");
		states.add("Manipura");
		states.add("Meghalaya");

		System.out.println("Total States :" + states.size());

		Iterator<String> iterator = states.iterator();
		while (iterator.hasNext()) {
			String state = iterator.next();
			System.out.println(state+" State");
		}

	}
}
