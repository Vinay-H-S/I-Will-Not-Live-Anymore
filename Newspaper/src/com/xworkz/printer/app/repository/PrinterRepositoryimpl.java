package com.xworkz.printer.app.repository;

import com.xworkz.printer.app.dto.PrinterDTO;

public class PrinterRepositoryimpl implements PrinterRepository{
	
	private PrinterDTO dtos[]=new PrinterDTO[TOTAL_ITEM]; 
	private int increment;
	
	@Override
	public void save(PrinterDTO dto)
	{
		System.out.println("running save in "+this.getClass().getSimpleName());
		if(increment<TOTAL_ITEM)
		{
			this.dtos[increment]=dto;
			System.out.println(dto);
			this.increment++;
		}
		else
		{
			System.err.println("Dto cannot save..");
		}
	}
	
}
