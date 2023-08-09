package com.over.riding.task.app;

public class Bakery {

	public String name;
	public String location;
	public int noOfWorkers;
	public double workersSalary;
	public int noOfCounters;

	public void food() {
		System.out.println("invoking food of no-arg..");
	}

	public void food(String name) {
		System.out.println("invoking food of String...");
	}

	public void food(String name, String location) {
		System.out.println("invoking food of String and String...");
	}

	public void food(String name, String location, int noOfWorkers) {
		System.out.println("invoking food of String, String and int..");
	}

	public void food(String name, String location, int noOfWorkers, double workersSalary) {
		System.out.println("invoking food of String, String, int and double...");
	}

	public void food(String name, String location, int noOfWorkers, double workersSalary, int noOfCounters) {
		System.out.println("invoking foof of String, String, int, double and int...");
	}

}
