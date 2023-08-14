package com.xworkz.abstractt.app;

public class AdventureTrip extends Trip{
	@Override
	public void bungeeJump() {
		System.out.println("Bungee jumping Method.....");
	}

	@Override
	public void paragliding() {
		System.out.println("paradiling Method.....");

	}

	@Override
	public void rollerCoster() {
		System.out.println("RollerCoster Method.....");
	}

	@Override
	public void skyDiving() {
		System.out.println("SkyDiving Method.....");

	}

	@Override
	public void watergames() {
		System.out.println("WaterGames Method.....");

	}
	
	@Override
	public void rajasthanTrip() {
		System.out.println("invoking RoadTrip Method...");
	}
	
	@Override
	public void keralaTrip() {
		System.out.println("invoking KeralaTrip Method...");
	}


}
