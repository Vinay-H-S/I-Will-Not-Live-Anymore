package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {
		Collection<TheaterDTO> collection = new ArrayList<TheaterDTO>(
				Arrays.asList(new TheaterDTO("Geethanjali", "Baire Gowda", 800, 3),
						new TheaterDTO("Aruna", "Jeevan", 1000, 5), new TheaterDTO("Ashok 4K", "Harshith", 950, 2),
						new TheaterDTO("Kumar", "Manjunath", 700, 2), new TheaterDTO("Satalite", "Govind", 1100, 3)));
		
		for (TheaterDTO theaterDTO : collection) {
			System.out.println(theaterDTO);
		}
		
		System.out.println("\n-------------------------------------------------------------");
		collection.stream().sorted().forEach(p->System.out.println(p.getNoOfSeats()));
	}
}
