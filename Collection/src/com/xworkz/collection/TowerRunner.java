package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.TowerDTO;

public class TowerRunner {

	public static void main(String[] args) {

		Collection<TowerDTO> collection = new ArrayList<TowerDTO>(
				Arrays.asList(new TowerDTO("Burj Khalifa", "Emaar Properties", 828),
						new TowerDTO("Shanghai Tower", "Shanghai tower construction and development co ltd", 632),
						new TowerDTO("One world trade center", "Port authority of new york", 541),
						new TowerDTO("Taipei 101", "Taipei financial center corporation", 508),
						new TowerDTO("Petronas Tower", "KLLC Holdings", 451)));
		
		for (TowerDTO towerDTO : collection) {
			System.out.println(towerDTO);
		}
		
		System.out.println("\n---------------------------------------------------------");
		
		collection.stream().sorted().forEach(p->System.out.println(p.getHeight()));
	}
}
