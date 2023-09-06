package com.xworkz.crud.app.repository;

public class LocationRepositoryimpl implements LocationRepository{
	
	private String locations[]=new String[TOTAL_LOCATION];
	private int positions;
	
	@Override
	public void store(String location) {
		System.out.println("invoking store data in "+this.getClass().getSimpleName());
		if(positions<TOTAL_LOCATION)
		{
			this.locations[positions]=location;
			System.out.println("Stored "+location+" at position "+this.positions);
			this.positions++;
		}
		else
		{
			System.err.println("Stored location is more than total location..");
		}
		
	}
	
	@Override
	public boolean isExist(String location) {
		for (int index = 0; index < this.positions; index++) {
			String temp = this.locations[index];
			if (temp != null && temp.equals(location)) {
				System.out.println("country name is already exist");
				return true;
			}
		}
		return false;
	}

}