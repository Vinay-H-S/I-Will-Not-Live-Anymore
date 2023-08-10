package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class PubgRunner {

	Pubg pubg = new Pubg();
	pubg.setGameName("pubg MobileLite");
	pubg.setVoice(true);
	pubg.setNoOfPlayers(4);
	pubg.setSince(2000);
	pubg.setVehicle("Bike");
	pubg.setWeapon("Gun");
	pubg.setTeamMembers(30);
	pubg.setChickenDinner(true);
	pubg.setEnemyCount(4);
	pubg.setWeather("Rain");
	pubg.setFootStep(true);
	pubg.setVehicleSpeed(60);
	pubg.setFounder("Greene");
	pubg.setRating(3);
	System.out.println(pubg.getGameName());
	System.out.println(pubg.isVoice());
	System.out.println(pubg.getNoOfPlayers());
	System.out.println(pubg.getSince());
	System.out.println(pubg.getVehicle());
	System.out.println(pubg.getWeapon());
	System.out.println(pubg.getTeamMembers());
	System.out.println(pubg.isChickenDinner());
	System.out.println(pubg.getEnemyCount());
	System.out.println(pubg.getWeather());
	System.out.println(pubg.isFootStep());
	System.out.println(pubg.getVehicleSpeed());
	System.out.println(pubg.getFounder());
	System.out.println(pubg.getRating());
}
