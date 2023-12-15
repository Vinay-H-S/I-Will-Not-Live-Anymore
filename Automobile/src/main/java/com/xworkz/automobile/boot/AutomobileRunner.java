package com.xworkz.automobile.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;
import com.xworkz.automobile.service.AutomobileService;
import com.xworkz.automobile.service.AutomobileServiceImpl;

public class AutomobileRunner {

	public static void main(String[] args) {

//		VehicleDTO dto = new VehicleDTO("BMW", "Black", "4-Wheeler", 2021);
//		VehicleDTO dto1 = new VehicleDTO("Audi", "Green", "4-Wheeler", 2019);
//		VehicleDTO dto2 = new VehicleDTO("Benz", "White", "4-Wheeler", 2020);
//
//		List<VehicleDTO> dtos = new ArrayList<VehicleDTO>(
//				Arrays.asList(new VehicleDTO("Swift", "Red", "4-Wheeler", 2015),
//						new VehicleDTO("Honda City", "Mat Black", "4-Wheeler", 2023)));
//	

//
//		VehicleDTO dto=new VehicleDTO();
//		dto.setColor("Purple");
//		dto.setModel(2023);
//	dto.setName("BMW");
//	
//		AutomobileService automobileService = new AutomobileServiceImpl();
//		automobileService.validateAndSaveVehicleDetails(dtos);

//		VehicleDTO vehicleDTO = new VehicleDTO();
//		vehicleDTO.setColor("Black");
//		vehicleDTO.setModel(2023);
//		vehicleDTO.setName("BMW");
//
//		VehicleDTO vehicleDTO1 = new VehicleDTO();
//		vehicleDTO1.setColor("Green");
//		vehicleDTO1.setModel(2019);
//		vehicleDTO1.setName("Audi");
//
//		List<VehicleDTO> dtos = new ArrayList<VehicleDTO>();
//		dtos.add(vehicleDTO);
//		dtos.add(vehicleDTO1);
//
		AutomobileService automobileService = new AutomobileServiceImpl();
		automobileService.fetchAllDetails();
		
		
		
	}

}
