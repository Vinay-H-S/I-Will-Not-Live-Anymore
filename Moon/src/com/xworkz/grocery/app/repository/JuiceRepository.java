package com.xworkz.grocery.app.repository;

public interface JuiceRepository {

	int TOTAL_ITEMS = 10;

	void store(String juice);
	
	default boolean isExist(String juice)
	{
		return false;
	}
	
}
