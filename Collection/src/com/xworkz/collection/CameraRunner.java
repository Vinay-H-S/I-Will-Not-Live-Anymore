package com.xworkz.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.app.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {

		Collection<CameraDTO> collection = new ArrayList<CameraDTO>(
				Arrays.asList(new CameraDTO(1, "Nikon", "DLR", 23000, LocalDate.of(2023, 07, 21)),
						new CameraDTO(2, "Canon", "SLR-20", 21000, LocalDate.of(2021, 11, 15)),
						new CameraDTO(3, "Samsung", "MD-211", 45000, LocalDate.of(2019, 12, 31)),
						new CameraDTO(4, "Sony", "KDL-73", 95000, LocalDate.of(2022, 07, 24)),
						new CameraDTO(5, "Canon", "GMS-21", 32000, LocalDate.of(2018, 01, 11))));

		for (CameraDTO array : collection) {
			System.out.println(array);
		}

		collection.stream().filter((camera) -> camera.getBrand().equals("Canon"))
				.forEach(c -> System.out.println("\n" + c));

		Collection<String> models = new ArrayList<String>();

		collection.stream().filter(c -> c.getModel().equals("Canon")).forEach(c -> models.add(c.getModel()));

		System.out.println("\n----------------------------------------------------------------------");
		collection.stream().filter(c -> c.getModel().equals("DLR")).map(cam -> cam.getCost())
				.forEach(p -> System.out.println("Price :"+p));
	}
}
