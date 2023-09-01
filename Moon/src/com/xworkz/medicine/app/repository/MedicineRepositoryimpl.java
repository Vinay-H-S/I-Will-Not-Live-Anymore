package com.xworkz.medicine.app.repository;

public class MedicineRepositoryimpl implements MedicineRepository {

	String[] names=new String[MEDICINE_LIST];
	int category;
	
	@Override
	public void list(String names) {
		System.out.println("invoking list in MedicineRepositoryimpl..");
		if(category<MEDICINE_LIST)
		{
			this.names[category]=names;
			System.out.println("Stored "+names +" in position "+this.category);
			this.category++;
		}
		else
		{
			System.err.println("Stored names is more than Medicine list...");
		}
	}

}
