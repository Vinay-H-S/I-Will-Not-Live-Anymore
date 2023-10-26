package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {

	public static void main(String[] args) {

		Collection<String> laptop = new ArrayList<String>();
		laptop.add("Acer Aspire E15");
		laptop.add("Dell XPS 13 ");
		laptop.add("HP Spectre x360");
		laptop.add("Lenovo ThinkPad");
		laptop.add("ASUS ZenBook 14");
		laptop.add("MacBook Air  ");
		laptop.add("MSI GS65 Stealt");
		laptop.add("Razer Blade 15 ");
		laptop.add("LG Gram 17  ");
		laptop.add("Microsoft Surfa");
		laptop.add("Huawei MateBook");
		laptop.add("Alienware Area-");
		laptop.add("Toshiba Satelli");
		laptop.add("Sony VAIO Z  ");
		laptop.add("Google Pixelboo");
		laptop.add("Lenovo Legion Y");
		laptop.add("Acer Predator H");
		laptop.add("HP Omen X ");
		laptop.add("ASUS ROG Zephyr");
		laptop.add("MacBook Pro  ");
		laptop.add("Microsoft Surfa");
		laptop.add("Dell Inspiron 1");
		laptop.add("Lenovo Yoga C93");
		laptop.add("ASUS VivoBook S");
		laptop.add("MSI GE75 Raider");
		laptop.add("LG Gram 14  ");
		laptop.add("HP Envy x360 ");
		laptop.add("Acer Swift 5  ");
		laptop.add("Dell G5 15 ");
		laptop.add("ASUS TUF Gaming");
		laptop.add("Lenovo IdeaPad ");
		laptop.add("Microsoft Surfa");
		laptop.add("Acer Chromebook");
		laptop.add("MSI Prestige 14");
		laptop.add("Alienware m15  ");
		laptop.add("ASUS Chromebook");
		laptop.add("Lenovo Chromebo");
		laptop.add("HP Chromebook x");
		laptop.add("Dell Chromebook");
		laptop.add("Acer Spin 3 ");
		laptop.add("Samsung Galaxy ");
		laptop.add("Lenovo Legion 5");
		laptop.add("ASUS ROG Strix ");
		laptop.add("MSI GL65 Leopar");
		laptop.add("HP Pavilion x36");
		laptop.add("Dell Precision ");
		laptop.add("LG Ultra PC");
		laptop.add("Acer Nitro 5 ");
		laptop.add("ASUS ZenBook Pr");
		laptop.add("Microsoft Surfa");

		System.out.println("Total Laptop Models:" + laptop.size());

		Iterator<String> lap = laptop.iterator();
		while (lap.hasNext()) {
			String names = lap.next();
			System.out.println(names + ": 2023 Model");
		}
	}
}
