package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;
import com.xworkz.automobile.repo.AutomobileRepository;
import com.xworkz.automobile.repo.AutomobileRepositoryImpl;

public class AutomobileServiceImpl implements AutomobileService {

	AutomobileRepository automobileRepository = new AutomobileRepositoryImpl();

	public void validateAndSaveVehicleDetails(VehicleDTO vehicleDTO) {

		if (vehicleDTO.getName() != null && !vehicleDTO.getName().isEmpty() && vehicleDTO.getColor() != null
				&& vehicleDTO.getModel() != 0 && !vehicleDTO.getType().isEmpty()) {
			automobileRepository.saveVehicleDetails(vehicleDTO);
			System.out.println("Data is valid and saved to database..");
		} else {
			System.err.println("Vehicle details is invalid..");
		}
	}

	public void validateAndSaveVehicleDetails(List<VehicleDTO> vehicleDTO) {

		for (VehicleDTO vehicle : vehicleDTO) {
			if (vehicle.getName() != null && !vehicle.getName().isEmpty() && vehicle.getColor() != null
					&& vehicle.getModel() != 0 && !vehicle.getType().isEmpty()) {
				automobileRepository.saveVehicleDetails(vehicleDTO);
				System.out.println("Data is valid and saved to database..");
			} else {
				System.err.println("Vehicle details is invalid..");
			}
		}

	}

	public void validateAndUpdateSaveVehicleDetails(VehicleDTO updateVehicles) {

		if (updateVehicles.getName() != null && !updateVehicles.getName().isEmpty() && updateVehicles.getColor() != null
				&& updateVehicles.getModel() != 0) {
			automobileRepository.updateAndSaveVehicle(updateVehicles);
			System.out.println("Data is valid and updated in database..");
		} else {
			System.err.println("Vehicle details is invalid can");
		}
	}

	public void vlaidateAndUpdateSaveVehicleDetails(List<VehicleDTO> updateVehicles) {

		for (VehicleDTO vehicleDTO : updateVehicles) {
			if (vehicleDTO.getName() != null && !vehicleDTO.getName().isEmpty() && vehicleDTO.getColor() != null
					&& vehicleDTO.getModel() != 0) {
				automobileRepository.updateAndSaveVehicle(updateVehicles);
				System.out.println("Data is valid and updated in database..");
			} else {
				System.err.println("Vehicle details is invalid can");
			}
		}

	}

	public List<VehicleDTO> fetchAllDetails() {

		List<VehicleDTO> vehicle = automobileRepository.fetchAllDetails();
		for (VehicleDTO vehicleDTO : vehicle) {
			System.out.println("Name :"+vehicleDTO.getName());
			System.out.println("Color :"+vehicleDTO.getColor());
			System.out.println("Model :"+vehicleDTO.getModel());
			System.out.println("Type :"+vehicleDTO.getType());
			System.out.println();
		}
		return null;
	}
}
