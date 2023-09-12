package com.xworkz.engineer.app;

import com.xworkz.engineer.app.dto.EngineerDTO;
import com.xworkz.engineer.app.repository.EngineerRepository;
import com.xworkz.engineer.app.repository.EngineerRepositoryimpl;
import com.xworkz.engineer.app.service.EngineerService;
import com.xworkz.engineer.app.service.EngineerServiceimpl;

public class EngineerRunner {

	public static void main(String[] args) {

		EngineerRepository engineerRepository=new EngineerRepositoryimpl();
		
		EngineerService engineerService=new EngineerServiceimpl(engineerRepository);
		
		EngineerDTO dto=new EngineerDTO(2563,"Vinay H S","PESITM");
		engineerService.validateAndSave(dto);
		
		
		System.out.println("\n");
		EngineerDTO dto1=new EngineerDTO(2563,"Vinay H S","PESITM");
		engineerService.validateAndSave(dto1);
		
	}

}
