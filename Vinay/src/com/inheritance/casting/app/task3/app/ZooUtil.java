package com.inheritance.casting.app.task3.app;

public class ZooUtil {
	
	public static void zebra(Zoo zoo)
	{
		System.out.println(zoo.location);
		zoo.safari();
		
		if(zoo instanceof StateZoo)
		{
			StateZoo cage=(StateZoo)zoo;
			System.out.println(cage.location);
			cage.state();
		}
		
		if(zoo instanceof NationalZoo)
		{
			NationalZoo cage1=(NationalZoo)zoo;
			System.out.println(cage1.location);
			cage1.national();
		}
		
	}

}
