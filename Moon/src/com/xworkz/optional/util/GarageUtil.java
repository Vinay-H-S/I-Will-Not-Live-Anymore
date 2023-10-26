package com.xworkz.optional.util;

import java.util.Optional;

public class GarageUtil {

	public static Optional<String> getName(String fname,String lname)
	{
		if(fname!=null && lname!=null)
		{
			System.out.println("fname and lname is not empty");
			return Optional.of(fname+" "+lname);
		}
		else
		{
			System.err.println("fname and lname are null");
		}
		return Optional.empty();
	}
}
