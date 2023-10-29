package com.xworkz.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTORunner;

public class ApplicationRunner {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2005, 10, 7);
		ApplicationDTORunner applicationDto1 = new ApplicationDTORunner("Facebook", "14.6", "FB", date, 5.8);
		LocalDate date1 = LocalDate.of(2009, 9, 24);
		ApplicationDTORunner applicationDto2 = new ApplicationDTORunner("WhatsApp", "11.7", "Whatsapp", date1, 8.7);
		LocalDate date2 = LocalDate.of(2004, 8, 11);
		ApplicationDTORunner applicationDto3 = new ApplicationDTORunner("Instagram", "3.85", "Instagram", date2, 9.5);
		LocalDate date3 = LocalDate.of(1998, 2, 13);
		ApplicationDTORunner applicationDto4 = new ApplicationDTORunner("Twitter", "4.9", "Twitter", date3, 6.5);
		LocalDate date4 = LocalDate.of(2004, 8, 31);
		ApplicationDTORunner applicationDto5 = new ApplicationDTORunner("Snapchat", "9.6", "Snapchat", date4, 7.8);

		Collection<ApplicationDTORunner> collection = new ArrayList<ApplicationDTORunner>();
		collection.add(applicationDto1);
		collection.add(applicationDto2);
		collection.add(applicationDto3);
		collection.add(applicationDto4);
		collection.add(applicationDto5);

		Iterator<ApplicationDTORunner> apps = collection.iterator();
		while (apps.hasNext()) {
			ApplicationDTORunner applicationDTO = apps.next();
			System.out.println("Name :"+applicationDTO.getName());
		}
	}
}
