package com.association.task.app;

public class Ingredent {
	public String name;
	public float quantity;
	public int cost;

	public Ingredent(String name, float quantity, int cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;

	}

	public void displayInfo() {
		System.out.println("Name :" + this.name);
		System.out.println("Quantity :" + this.quantity);
		System.out.println("Cost :" + this.cost);
	}

}
