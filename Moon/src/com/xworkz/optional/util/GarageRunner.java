package com.xworkz.optional.util;

import java.util.Optional;

public class GarageRunner {

	public static void main(String[] args) {

		Optional<String> optional=GarageUtil.getName("M S", "Dhoni");
		if(optional.isPresent())
		{
			String ref=optional.get();
			System.out.println(ref);
		}
		else
		{
			System.err.println("Optional is empty..");
		}
		
	}

}
