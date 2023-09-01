package com.xworkz.grocery.app.repository;

public class GroceryRepositoryimpl implements GroceryRepository {
	
	String[] groceries=new String[TOTAL_ITEMS];
	int position;
	
	@Override
	public void save(String groceries) {
		System.out.println("invoking save in GroceryRepository..");
		if(position<TOTAL_ITEMS)
		{
		this.groceries[position]=groceries;
		System.out.println("Stored "+groceries +" in position "+this.position);
		this.position++;
		}
		else
		{
			System.err.println("Stored items is more than total items..");
		}
	}

}
