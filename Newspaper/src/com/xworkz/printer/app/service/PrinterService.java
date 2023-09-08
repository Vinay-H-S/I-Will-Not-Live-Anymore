package com.xworkz.printer.app.service;

import com.xworkz.printer.app.dto.PrinterDTO;

public interface PrinterService {

	boolean validateAndSave(PrinterDTO dto);
}
