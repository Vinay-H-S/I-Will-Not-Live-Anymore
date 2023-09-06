package com.xworkz.crud.app.repository;

public interface PincodeRepository {

	int TOTAL_PINCODE = 7;

	void list(int pincode);

	default boolean isExist(int pincode) {
		return false;
	}

}
