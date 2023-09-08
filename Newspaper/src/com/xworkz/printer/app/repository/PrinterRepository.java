package com.xworkz.printer.app.repository;

import com.xworkz.printer.app.dto.PrinterDTO;

public interface PrinterRepository {

	int TOTAL_ITEM=5;
	
	void save(PrinterDTO dto);
}
