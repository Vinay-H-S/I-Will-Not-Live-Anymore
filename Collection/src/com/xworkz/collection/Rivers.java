package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Rivers {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		collection.add("Bhadra");
		collection.add("Tunga");
		collection.add("Ganga");
		collection.add("Kaveri");
		collection.add("Sharavathi");

		System.out.println("Total rivers :" + collection.size());

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String names = iterator.next();
			System.out.println(names);
		}
	}
}