package com.xworkz.printer.app.runner;

import com.xworkz.printer.app.dto.PrinterDTO;
import com.xworkz.printer.app.repository.PrinterRepository;
import com.xworkz.printer.app.repository.PrinterRepositoryimpl;
import com.xworkz.printer.app.service.PrinterService;
import com.xworkz.printer.app.service.PrinterServiceimpl;

public class PrinterRunner {

	public static void main(String[] args) {

		PrinterRepository printerRepository=new PrinterRepositoryimpl();
		
		PrinterService printerService=new PrinterServiceimpl(printerRepository);
		
		PrinterDTO dto=new PrinterDTO("Samsung",true,12399);
		printerService.validateAndSave(dto);
	}

}
