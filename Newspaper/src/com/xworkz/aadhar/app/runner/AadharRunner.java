package com.xworkz.aadhar.app.runner;

import com.xworkz.aadhar.app.dto.AadharDTO;
import com.xworkz.aadhar.app.repository.AadharRepository;
import com.xworkz.aadhar.app.repository.AadharRepositoryimpl;
import com.xworkz.aadhar.app.service.AadharService;
import com.xworkz.aadhar.app.service.AadharServiceimpl;

public class AadharRunner {

	public static void main(String[] args) {

		AadharRepository aadharRepository=new AadharRepositoryimpl();
		
		AadharService aadharService=new AadharServiceimpl(aadharRepository);
		
		AadharDTO aadharDTO=new AadharDTO("Vinay H S",5089250582015623L,"Karnataka");
		aadharService.validateAndSave(aadharDTO);
	}

}
