package com.xworkz.application.app.runner;

import com.xworkz.application.app.dto.ApplicationDTO;
import com.xworkz.application.app.repository.ApplicationRepository;
import com.xworkz.application.app.repository.ApplicationRepositoryimpl;
import com.xworkz.application.app.service.ApplicationService;
import com.xworkz.application.app.service.ApplicationServiceimpl;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationRepository applicationRepository=new ApplicationRepositoryimpl();
		
		ApplicationService applicationService=new ApplicationServiceimpl(applicationRepository);
		
		ApplicationDTO dto=new ApplicationDTO(2561,"Vinay H S","IBM","JavaScript","Java 1.8");
		
		System.out.println("\n");
		applicationService.validateAndSave(dto);
		
		ApplicationDTO dto1=new ApplicationDTO(2561,"Vinay H S","IBM","JavaScript","Java 1.8");
		
		System.out.println("\n");
		applicationService.validateAndSave(dto1);
		
		System.out.println("\n");
		applicationService.findByName("Vinay H S");
		
		System.out.println("\n");
		applicationService.findByNameAndDevelopedBy("Vinay H S","IBM");
		
		
	}
}
