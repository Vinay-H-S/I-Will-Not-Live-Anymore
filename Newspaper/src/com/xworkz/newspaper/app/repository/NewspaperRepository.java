package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperRepository {

	int TOTAL_ITEMS=10;
	
	void save(NewspaperDTO dto);
}
