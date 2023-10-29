package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tools {

	public static void main(String[] args) {
		Collection<String> tools = new ArrayList<String>();
		tools.add("Plier");
		tools.add("Spanner");
		tools.add("Hammer");
		tools.add("Saw");
		tools.add("Screw Driver");
		tools.add("Jack");
		tools.add("Cutter");

		System.out.println("Tools Size :" + tools.size());

		Collection<String> tools1 = new ArrayList<String>();
		tools1.add("Flash Light");
		tools1.add("Wrench");

		System.out.println(tools.containsAll(tools1));

		Collection<String> tools2 = new ArrayList<String>();
		tools2.add("Spanner");
		tools2.add("Screw");

		tools.addAll(tools2);

		boolean value = tools.removeAll(tools2);
		System.out.println(value);
			
		System.out.println("Tools 2 Size :"+tools2.size());

		System.out.println(tools);
		
	}

}
