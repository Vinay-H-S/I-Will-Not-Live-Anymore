package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repository.NewspaperRepository;

public class NewspaperServiceimpl implements NewspaperService{

	private NewspaperRepository newspaperRepository;
	
	public NewspaperServiceimpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository=newspaperRepository;
	}
	
	@Override
	public boolean validataAndSave(NewspaperDTO dto) {
		System.out.println("running validateAndSave in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("dto is valid, can save..");
			String name=dto.getName();
			String lang=dto.getLng();
			double cost=dto.getCost();
			if(name!=null && lang!=null)
			{
				System.out.println("Name and Language is valid..");
			}
			else
			{
				System.err.println("Name and Language is invalid, cannot save");
			}
			if(cost<10)
			{
				System.out.println("Cost is valid..");
			}
			else
			{
				System.err.println("Cost is invalid..");
			}
			this.newspaperRepository.save(dto);
			return true;
		}
		else
		{
			System.err.println("dto is invalid, cannot save..");
		}
		
		return false;
	}
	
	

}
