package com.xworkz.crud.app.repository;

public class CountryRepositoryimpl implements CountryRepository{

	private String location[]=new String[TOTAL_COUNTRY];
	private int position;
	
	@Override
	public void save(String country) {
		System.out.println("invoking store data to " + this.getClass().getSimpleName());
		if (position < TOTAL_COUNTRY) {
			this.location[position] = country;
			System.out.println("Stored " + country + " at position " + this.position);
			this.position++;
		} else {
			System.out.println("Stored country item is more than total items..");
		}
	}
	
	@Override
	public boolean isExist(String country) {
			for (int index = 0; index < this.position; index++) {
				String temp = this.location[index];
				if (temp != null && temp.equals(country)) {
					System.out.println("country name is already exist");
					return true;
				}
			}
			return false;
		}

	}