package com.association.task2.boot;

import com.association.task2.app.*;

public class SportRunner {

	public static void main(String[] args) {
		
		String name="Cricket";

		Floor flow=new Floor("1st Floor",1);
		Floor flow1=new Floor("2st Floor",2);
		Floor flow2=new Floor("3st Floor",3);
		Floor flow3=new Floor("4st Floor",4);
		Floor flow4=new Floor("5st Floor",5);
		
		Floor[] floor= {flow,flow1,flow2,flow3,flow4};
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lift0= {lift,lift1,};		
		
		Building build=new Building(floor,lift0);
		Building build1=new Building(floor,lift0);
		
		
		Building[] building={build,build1};
		
		Corporator corporator=new Corporator("Kanthraj",building);
		
		Area road=new Area("Argora",corporator);
		Area road1=new Area("Baneshwar Nagar",corporator);
		Area[] area= {road,road1};
		
		HomeTown town=new HomeTown("Ranchi",831054,area);
		
		
		Player play0=new Player("Virat Kholi",18,town,build);
		Player play1=new Player("M S Dhoni",22,town,build1);
		Player[] players= {play0,play1};
		
		Sport sport=new Sport(name,players);
		sport.displayInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
