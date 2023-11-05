package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ActorNames {

	public static void main(String[] args) {

		Collection<String> actorNames = new ArrayList<String>();

		actorNames.add("Drashan");
		actorNames.add("Sudeep");
		actorNames.add("Yash");
		actorNames.add("Dhanush");
		actorNames.add("Vijay Thalapathy");
		actorNames.add("Puneeth Rajkumar");
		actorNames.add("Shivaraj Kumar");
		actorNames.add("Sri Muruli");
		actorNames.add("Rishab Shetty");
		actorNames.add("Rakshith Shetty");
		actorNames.add("Varjramuni");

		String actor = "Vijay";
		String actor1 = "Yash";
		if (actorNames.contains(actor)) {
			System.out.println(actor + " Name is prsent in the list");
		} else {
			System.err.println(actor + " Name is not prsent in the list");
		}
		if (actorNames.contains(actor1)) {
			System.out.println(actor1 + " Name is prsent in the list");
		}

		Collection<String> famousActor = new ArrayList<String>();
		famousActor.add("Vijay Thalapathy");
		famousActor.add("Yash");

		if (actorNames.containsAll(famousActor)) {
			System.out.println("Famous Actors Names :" + famousActor);
		}

		Collection<String> removeActor = new ArrayList<String>();
		boolean value=removeActor.add("Yash");
		if(actorNames.remove(value)){
			System.out.println(removeActor);
		}

	}
}
