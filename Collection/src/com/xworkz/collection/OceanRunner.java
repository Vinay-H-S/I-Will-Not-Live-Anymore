package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {

		Collection<OceanDTO> collection = new ArrayList<OceanDTO>(
				Arrays.asList(new OceanDTO("Indian Ocean", 800, "South of india", "Circle"),
						new OceanDTO("Pacific Ocean", 11030, "Australia", "Triangular"),
						new OceanDTO("Atlantic Ocean", 1230, "Europe", "Elongated"),
						new OceanDTO("Southern Ocean", 9360, "Antarctica", "Circle"),
						new OceanDTO("Arctic Ocean", 8900, "North America", "irregular edge")));
		
		for(OceanDTO ocean:collection) {
			System.out.println(ocean);
		}
		
		collection.stream().sorted().forEach(p->System.out.println(p));
	}

}
