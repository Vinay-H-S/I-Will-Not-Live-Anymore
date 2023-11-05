package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.SaloonItemDTO;

public class SaloonItem {

	public static void main(String[] args) {

		Collection<SaloonItemDTO> collection = new ArrayList<SaloonItemDTO>(Arrays.asList(
				new SaloonItemDTO(1, "Trimmer", 2300, "Designed for msintain facial hair", true),
				new SaloonItemDTO(2, "Hair Crimper", 350, "for cutting and trimming hair", true),
				new SaloonItemDTO(3, "Flat iron", 1500, "Hair Straighting", false),
				new SaloonItemDTO(4, "Shaving Cream", 150, "Used for soften facial hair", true),
				new SaloonItemDTO(5, "Hair Clippers", 260, "For cutting and trimming hair", true),
				new SaloonItemDTO(6, "Hair Gel", 145, "Used for styling", true),
				new SaloonItemDTO(7, "Curling iron", 650, "create curls and waves in hair", false),
				new SaloonItemDTO(8, "Hair dryer", 560, "", true), new SaloonItemDTO(9, "Nail polish", 608, "", false),
				new SaloonItemDTO(10, "Makeup Brushes", 1200, "Appling makeup products", false)));

		for (SaloonItemDTO dto : collection) {
			System.out.println(dto);
		}
		System.out.println("\nTotal Saloon Items : " + collection.size());

		Collection<SaloonItemDTO> collection1 = new ArrayList<SaloonItemDTO>(
				Arrays.asList(new SaloonItemDTO(3, "Flat iron", 1500, "Hair Straighting", false)));
		
		System.out.println(collection.containsAll(collection1));
		
		System.out.println(collection.removeAll(collection1));
		System.out.println(collection.size());
		
	}

}
