package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public class NewspaperRepositoryimpl implements NewspaperRepository{
	
	private NewspaperDTO[] dtos=new NewspaperDTO[TOTAL_ITEMS];
	private int position;
	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("running dto in "+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS)
		{
			System.out.println(dto);
			this.dtos[position]=dto;
			this.position++;
		}
		else
		{
			System.err.println("Storage is full, cannot save..");
		}
	}

}
