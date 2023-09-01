package com.xworkz.historicalplaces.app.repository;

public class HistoricalPlacesRepository implements HistoricalPlaces {

	String[] names=new String[PLACE_LIST];
	int category;
	@Override
	public void venue(String names) {

		System.out.println("invoking list in PoliticianRepositoryimpl..");
		if(category<PLACE_LIST)
		{
			this.names[category]=names;
			System.out.println("Stored "+names +" in position "+this.category);
			this.category++;
		}
		else
		{
			System.err.println("Stored names is more than place list...");
		}
	}

}
