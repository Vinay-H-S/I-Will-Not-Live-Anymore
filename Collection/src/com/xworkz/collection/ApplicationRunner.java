package com.xworkz.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2005, 10, 7);
		ApplicationDTO applicationDto1 = new ApplicationDTO("Facebook", "14.6", "FB", date, 5.8);
		LocalDate date1 = LocalDate.of(2009, 9, 24);
		ApplicationDTO applicationDto2 = new ApplicationDTO("WhatsApp", "11.7", "Whatsapp", date1, 8.7);
		LocalDate date2 = LocalDate.of(2004, 8, 11);
		ApplicationDTO applicationDto3 = new ApplicationDTO("Instagram", "3.85", "Instagram", date2, 9.5);
		LocalDate date3 = LocalDate.of(1998, 2, 13);
		ApplicationDTO applicationDto4 = new ApplicationDTO("Twitter", "4.9", "Twitter", date3, 6.5);
		LocalDate date4 = LocalDate.of(2004, 8, 31);
		ApplicationDTO applicationDto5 = new ApplicationDTO("Snapchat", "9.6", "Snapchat", date4, 7.8);

		Collection<ApplicationDTO> collection = new ArrayList<ApplicationDTO>();
		collection.add(applicationDto1);
		collection.add(applicationDto2);
		collection.add(applicationDto3);
		collection.add(applicationDto4);
		collection.add(applicationDto5);

		Iterator<ApplicationDTO> apps = collection.iterator();
		while (apps.hasNext()) {
			ApplicationDTO applicationDTO = apps.next();
			System.out.println("Name :"+applicationDTO.getName());
		}
	}
}
