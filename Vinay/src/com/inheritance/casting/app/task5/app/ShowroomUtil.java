package com.inheritance.casting.app.task5.app;

public class ShowroomUtil {

	public static void shot(Showroom show)
	{
		System.out.println("Building No :"+show.buildingNo);
		show.room();
		
		if(show instanceof WatchShowroom)
		{
			WatchShowroom area=(WatchShowroom)show;
			System.out.println("Watch Showroom address :"+area.address);
			area.watch();
		}
		
		if(show instanceof MobileShowroom)
		{
			MobileShowroom area1=(MobileShowroom)show;
			System.out.println("Mobile Showroom address :"+area1.address);
			area1.mobile();
		}
	}
}
