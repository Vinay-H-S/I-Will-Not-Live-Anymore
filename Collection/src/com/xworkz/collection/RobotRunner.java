package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xworkz.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {
		Collection<RobotDTO> collection = new ArrayList<RobotDTO>(Arrays.asList(
				new RobotDTO("Epason", "Jhony george", 360000), new RobotDTO("Funuc", "Robert villy", 250000),
				new RobotDTO("ABB", "Daniel", 236000), new RobotDTO("Killem", "Kelvin likin", 4562120)));

		for (RobotDTO robotDTO : collection) {
			System.out.println(robotDTO);
		}

		System.out.println("\n--------------------------------------------------------------------------");
		collection.stream().sorted().forEach(p -> System.out.println(p));
	}

}
