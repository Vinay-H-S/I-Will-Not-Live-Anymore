package com.xworkz.automobile.repo;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;

public interface AutomobileRepository {

	void saveVehicleDetails(VehicleDTO vehicleDTO);

	void saveVehicleDetails(List<VehicleDTO> vehicleDTO1);
	
	void updateAndSaveVehicle(VehicleDTO updateVehicle);
	
	void updateAndSaveVehicle(List<VehicleDTO> updateVehicle);
	
	List<VehicleDTO> fetchAllDetails();
}
