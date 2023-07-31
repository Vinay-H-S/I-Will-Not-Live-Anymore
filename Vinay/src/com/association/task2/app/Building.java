package com.association.task2.app;

public class Building {
public Floor[] floor;
public Lift[] lift;

public Building(Floor[] floor,Lift[] lift)
{
	this.floor=floor;
	this.lift=lift;
}

public void displayInfo()
{
	for(int flow=0;flow<this.floor.length;flow++)
	{
		Floor ref=this.floor[flow];
		ref.displayInfo();
	}
	for(int flew=0;flew<this.lift.length;flew++)
	{
		Lift ref1=this.lift[flew];
		ref1.displayInfo();
	}
		
		
		
		
}

}
