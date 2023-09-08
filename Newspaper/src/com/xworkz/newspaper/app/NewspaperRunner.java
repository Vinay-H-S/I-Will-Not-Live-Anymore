package com.xworkz.newspaper.app;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repository.NewspaperRepository;
import com.xworkz.newspaper.app.repository.NewspaperRepositoryimpl;
import com.xworkz.newspaper.app.service.NewspaperService;
import com.xworkz.newspaper.app.service.NewspaperServiceimpl;

public class NewspaperRunner {
	
	public static void main(String[] args) {
		
		NewspaperRepository newspaperRepository=new NewspaperRepositoryimpl();
		
		NewspaperService newspaperService=new NewspaperServiceimpl(newspaperRepository);
		NewspaperDTO dto=new NewspaperDTO(); 
		boolean repo=newspaperService.validataAndSave(dto);
		System.out.println("Data is "+repo);

	}

	

	
	
}
