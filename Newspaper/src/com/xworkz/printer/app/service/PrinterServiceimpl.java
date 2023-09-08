package com.xworkz.printer.app.service;

import javax.sound.midi.SysexMessage;

import com.xworkz.printer.app.dto.PrinterDTO;
import com.xworkz.printer.app.repository.PrinterRepository;

public class PrinterServiceimpl implements PrinterService{
	
	private PrinterRepository printerRepository;
	
	
	
	public PrinterServiceimpl(PrinterRepository printerRepository)
	{
		this.printerRepository=printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto)
	{
		System.out.println("running validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid, can save..");
			String name=dto.getName();
			boolean colorPrinter=dto.getColorPrinter();
			double cost=dto.getCost();
			if(name!=null && !name.isEmpty())
			{
				System.out.println("Name is valid, can save");
			}
			else
			{
				System.err.println("Name is invalid, cannot save.. ");
			}
			if(colorPrinter==true)
			{
				System.out.println("this is color printer..");
			}
			else
			{
				System.err.println("this is not color printer..");
			}
			if(cost>0)
			{
				System.out.println("Cost is valid, can save.");
			}
			else
			{
				System.err.println("Cost is invalid, cannot save..");
			}
			this.printerRepository.save(dto);
			return true;
		}
		else
		{
			System.err.println("Dto is invalid, cannot save..");
		}
		return false;
	}
}
