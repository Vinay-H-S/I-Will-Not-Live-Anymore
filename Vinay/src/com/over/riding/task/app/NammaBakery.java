package com.over.riding.task.app;

public class NammaBakery extends Bakery {

	@Override
	public void food() {
		System.out.println("invoking food of no-arg in Namma Bakery...");
	}

	@Override
	public void food(String name) {
		System.out.println("invoking food of String in Namma Bakery...");
	}

	@Override
	public void food(String name, String location) {
		System.out.println("invoking food of String and String in Namma Bakery...");
	}

	@Override
	public void food(String name, String location, int noOfWorkers) {
		System.out.println("invoking food of String, String and int in Namma Bakery..");
	}

	@Override
	public void food(String name, String location, int noOfWorkers, double workersSalary) {
		System.out.println("invoking food of String, String, int and double in Namma Bakery...");
	}

	@Override
	public void food(String name, String location, int noOfWorkers, double workersSalary, int noOfCounters) {
		System.out.println("invoking foof of String, String, int, double and int in Namma Bakery...");
	}
}
