package com.xworkz.task.runner;

import com.xworkz.task.app.*;
import com.xworkz.task.impl.*;

public class AllInOneRunner {

	public static void main(String[] args) {
		
		System.out.println("-----------------METRO---------------");
		
		Metro metro=new MetroRules();
		metro.dontCarryExplosiveMaterials("Dynamite Flash Powder");
		metro.takeTokenOrSmartCard(true);
		metro.prohibatedFromCarryingLiquorBottles(true);
		
		System.out.println("-----------------TEMPLE---------------");
		
		Temple temple=new TempleRule();
		temple.queue("for darshana");
		temple.silence("must be silens");
		temple.dressCode("ethnicwere");
		
		System.out.println("-----------------HOSTEL---------------");
		
		Hostel hst=new HostelRule();
		hst.cleanNess("clean", 18);
		hst.DontUsePhones("jain hst");
		hst.dontWasteFoods("tammotoBath");
		
		System.out.println("-----------------PG---------------");
		
		PG pg=new PGRule();
		pg.payment("5000");
		pg.noFoodWeast(500);
		pg.timings(10);
		
		System.out.println("-----------------MILITARY---------------");
		
		Military military=new MilitaryRule();
		military.ageLimit(21);
		military.height(6);
		military.weight(70);
		
	}

}
