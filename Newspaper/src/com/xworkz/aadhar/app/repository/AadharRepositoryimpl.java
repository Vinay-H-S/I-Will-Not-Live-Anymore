package com.xworkz.aadhar.app.repository;

import com.xworkz.aadhar.app.dto.AadharDTO;

public class AadharRepositoryimpl implements AadharRepository{
	
	private AadharDTO dtos[]=new AadharDTO[TOTAL_NO];
	private int increment;
	
	@Override
	public void save(AadharDTO dto)
	{
		System.out.println("runnig dto in "+this.getClass().getSimpleName());
		if(increment<TOTAL_NO)
		{
			this.dtos[increment]=dto;
			System.out.println(dto);
			this.increment++;
		}
		else
		{
			System.err.println("Dto is cannot save..");
		}
	}

}
