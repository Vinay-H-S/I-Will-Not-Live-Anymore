package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Festival {

	public static void main(String[] args) {

		Collection<String> festival = new ArrayList<String>();
		festival.add("Dasara");
		festival.add("Makar Sankranti");
		festival.add("Lohri");
		festival.add("New Year");
		festival.add("Pongal");
		festival.add("Basant Panchmi");
		festival.add("Republic Day");
		festival.add("Mahashivratri");
		festival.add("Ram Navami");
		festival.add("Mewar Festival");
		festival.add("Ugadi");
		festival.add("Holi");
		festival.add("Rath Yatra");
		festival.add("Buddha Purnima");
		festival.add("Rabindra Jayanti");

		System.out.println("total number of functions " + festival.size());

		System.out.println(".............");

		System.out.println("Festivals with more than 6 characters:");

		for (String festivalName : festival) {
			if (festivalName.length() > 6) {
				System.out.println(festivalName);

			}
		}

		System.out.println("Festivals with less than 6 characters:");

		for (String fest : festival) {
			if (fest.length() < 6) {
				System.out.println(fest);
			}
		}
		System.out.println("Festivals containing 'o':");
		festival.stream().filter(fest -> fest.contains("o")).forEach(System.out::println);

		System.out.println("Festivals containing 'g':");
		festival.stream().filter(fest -> fest.contains("g")).forEach(System.out::println);

		System.out.println(".................");
		for (String festivalName : festival) {
			if (festivalName.endsWith("s")) {
				System.out.println(festivalName);

			}
		}

		System.out.println("Elements containing 'R':");
		for (String fest : festival) {
			if (fest.contains("R")) {
				System.out.println(fest);
			}
		}

		System.out.println("Elements containing 'Ram':");
		for (String fest : festival) {
			if (fest.contains("Ram")) {
				System.out.println(fest);
			}
		}

	}

}
