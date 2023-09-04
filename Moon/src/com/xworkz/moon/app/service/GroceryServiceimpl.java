package com.xworkz.moon.app.service;

import com.xworkz.grocery.app.repository.GroceryRepository;

public class GroceryServiceimpl implements GroceryService {
	
	private GroceryRepository groceryRepository;
	
	public GroceryServiceimpl(GroceryRepository groceryRepository) {
		this.groceryRepository=groceryRepository;
	}
	
	@Override
	public boolean save(String grocery) {
		System.out.println("invoking validate and save" +this.getClass().getSimpleName());
		if(grocery!=null && !grocery.isEmpty() && grocery.length()>=0 && grocery.length()>=3)
		{
			System.out.println("Grocery data is valid");
			this.groceryRepository.save(grocery);
		}
		else
		{
			System.out.println("Grocery data is invalid, cannot save");
		}
		return false;
	}

}
