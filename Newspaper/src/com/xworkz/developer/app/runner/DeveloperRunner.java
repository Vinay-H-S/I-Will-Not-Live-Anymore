package com.xworkz.developer.app.runner;

import com.xworkz.developer.app.dto.DeveloperDTO;
import com.xworkz.developer.app.repository.DeveloperRepository;
import com.xworkz.developer.app.repository.DeveloperRepositoryimpl;
import com.xworkz.developer.app.service.DeveloperService;
import com.xworkz.developer.app.service.DeveloperServiceimpl;

public class DeveloperRunner {

	public static void main(String[] args) {

		DeveloperRepository developerRepository=new DeveloperRepositoryimpl();
		
		DeveloperService developerService=new DeveloperServiceimpl(developerRepository);
		
		DeveloperDTO developerDTO=new DeveloperDTO("Vinay H S",1,25000,"IBM","Software developer",true);
		
		developerService.validateAndSave(developerDTO);
		System.out.println("\n");
		
		DeveloperDTO developerDTO1=new DeveloperDTO("Vinay H S",1,25000,"IBM","Software developer",true);
		developerService.validateAndSave(developerDTO1);
		
		System.out.println("\n");
		developerService.findByName("Vinay H S");
		
		System.out.println("\n");
		developerService.findByWorkingFor("IBM");
		
		System.out.println("\n");
		developerService.findByDesignation("Software developer");
		
		System.out.println("\n");
		developerService.findByNameAndWorkingFor("Vinay H S","IBM");
		
		System.out.println("\n");
		developerService.findByNameAndSalaryAndDesigantion("Vinay H S",25000,"Software developer");
	}

}
