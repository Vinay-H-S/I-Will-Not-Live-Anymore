package com.xworkz.crud.app.repository;

public interface TrainNoRepository {
	
	int TOTAL_TRAIN_NO_S=5;
	
	void numbers(int trainNo);
	
	default boolean isExist(int trainNo)
	{
		return false;
	}

	
}
