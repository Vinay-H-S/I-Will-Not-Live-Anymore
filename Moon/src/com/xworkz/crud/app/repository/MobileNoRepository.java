package com.xworkz.crud.app.repository;

public interface MobileNoRepository {

	int TOTAL_MOBILE_NO_S=5;
	
	void save(long mobileNo);
	
	default boolean isExist(long mobileNo)
	{
		return false;
	}
}
