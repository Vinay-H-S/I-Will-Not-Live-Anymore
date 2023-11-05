package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {

		Collection<HotelDTO> collection = new ArrayList<HotelDTO>(
				Arrays.asList(new HotelDTO(1, "Maruthi Hotel", "Dhanush", "GDGD452126785TYHG", "India"),
						new HotelDTO(2, "GO naati", "Anil Kumar", "EDFGVC84551566KL", "India"),
						new HotelDTO(3, "Davanagere Benne Dose Hotel", "Veeranna", "FGHS256347895GTY", "India"),
						new HotelDTO(4, "Highland Tower", "Daniel", "FTGDL33265155GH", "UK"),
						new HotelDTO(5, "Kings house Hotel", "Richard sun", "TGHHC712300025FV", "UK"),
						new HotelDTO(6, "Marriot international", "Glen Maxwell", "RGFXDD4123125JJ", "USA"),
						new HotelDTO(7, "Fairfeild Hotel", "David warner", "OOLKNMJ4521365E", "USA"),
						new HotelDTO(8, "Pearl city hotel", "Atony", "ASZXDCC84551566KL", "Srilanka"),
						new HotelDTO(9, "Galle face Hotel", "Leo das", "TTFGVG47895GTY", "Srilanka"),
						new HotelDTO(10, "Thilanka Hotel", "Vikki", "TGDHV4516695LC", "Srilanka")));

		for (HotelDTO array : collection) {
			System.out.println(array);
		}
		System.out.println("\nfind all the hotel of India... \n");

		collection.stream().filter(hotel -> hotel.getLocation().equals("India")).map(h -> h.getName())
				.forEach(p -> System.out.println(p));

		System.out.println("\nfind all the hotel of srilanka... \n");

		collection.stream().filter(hotel -> hotel.getLocation().equals("Srilanka")).map(h -> h.getName())
				.forEach(p -> System.out.println(p));

		System.out.println("\nget only Owner Name... \n");

		collection.stream().filter(owner -> owner.getOwnerName().equals(owner.getOwnerName()))
				.map(o -> o.getOwnerName()).forEach(p -> System.out.println(p));

		System.out.println("\nget only Gst No... \n");

		collection.stream().filter(gst -> gst.getGstNo().equals(gst.getGstNo())).map(g -> g.getGstNo())
				.forEach(p -> System.out.println(p));

		System.out.println("\nget only id if location is UK... \n");

		collection.stream().filter(id -> id.getLocation().equals("UK")).map(i -> i.getId())
				.forEach(p -> System.out.println(p));

		System.out.println("\nget only Owner Name if location is USA... \n");

		collection.stream().filter(l -> l.getLocation().equals("USA")).map(owner -> owner.getOwnerName())
				.forEach(p -> System.out.println(p));
	}
}
