package com.association.task2.app;

public class Sport {
public String name;
public Player[] players;

public Sport(String name,Player[] players)
{
	this.name=name;
	this.players=players;
}
public void displayInfo()
{
	System.out.println("Sport Name :"+name);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^");
	for(int game=0;game<this.players.length;game++)
	{
		System.out.println("Players information");
		Player ref=this.players[game];
		ref.displayInfo();
	}
	
}


}
