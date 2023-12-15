package com.xworkz.map;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {

		CompanyDTO dtos1 = new CompanyDTO("Samsung", "Banglore", "sgufiafuafa8545");
		CompanyDTO dtos2= new CompanyDTO("Samsung", "Banglore", "sgufiafuafa8545");
		CompanyDTO dtos3= new CompanyDTO("Samsung", "Banglore", "sgufiafuafa8545");

		ProductDTO dto1 = new ProductDTO(1, "Tab", 45212.0, 1, LocalDate.of(2023, 10, 11));

		ProductDTO dto2 = new ProductDTO(2, "Basic-Phone", 1020.0, 2, LocalDate.of(2022, 5, 10));
		ProductDTO dto3 = new ProductDTO(3, "Smart-Phone", 56222.0, 3, LocalDate.of(2001, 1, 5));
		
		Map<ProductDTO, CompanyDTO> productAndCompany=new HashMap<ProductDTO, CompanyDTO>();
		productAndCompany.put(dto1, dtos1);
		productAndCompany.put(dto2, dtos2);
		productAndCompany.put(dto3, dtos3);

	}

}
