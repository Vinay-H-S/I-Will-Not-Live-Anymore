package com.over.riding.task.app;

public class BigHostel extends Hostel {

	public void jail() {
		System.out.println("invoking jail of no-arg in Big Hostel...");
	}

	public void jail(String name) {
		System.out.println("invoking jail of String in Big Hostel...");
	}

	public void jail(String name, String location) {
		System.out.println("invoking jail of String and String in Big Hostel...");
	}

	public void jail(String name, String location, int noOfWardens) {
		System.out.println("invoking jail of String, String and int in Big Hostel...");
	}

	public void jail(String name, String location, int noOfWardens, int noOfRooms) {
		System.out.println("invoking jail of String, String, int and int in Big Hostel...");
	}

	public void jail(String name, String location, int noOfWardens, int noOfRooms, double fee) {
		System.out.println("invoking jail of String, String, int, int and double in Big Hostel...");
	}
}
