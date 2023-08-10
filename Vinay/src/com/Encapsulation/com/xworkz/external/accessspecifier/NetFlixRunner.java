package com.xworkz.external.accessspecifier;

import com.xworkz.internal.accessspecifier.Netflix;

public class NetFlixRunner {
	
	public static void main(String[] args) {
	
	
		Netflix app4=new Netflix();
		app4.setoriginalAuthor("Marc Randolph");
		app4.setDevelopers("Netflix inc");
		app4.setReleaseYear(2007);
		app4.setStableReleaseIos(2023);
		app4.setStableReleaseAndriod(2022);
		app4.setStableReleaseWindows(2022);
		app4.setStableReleaseMacOs(2023);
		app4.setLangugesInIos(44);
		app4.setLangugesInAndriod(67);
		app4.setType("OTT streming platfrom");
		app4.setWebsite("www.Netflix.com");
		app4.setSizeForIos(361);
		app4.setSizeForAndriod(89);
		System.out.println("Original Author :"+app4.getOriginalAuthor());
		System.out.println("Developer :"+app4.getDevelopers());
		System.out.println("Release Year :"+app4.getReleaseYear());
		System.out.println("Stable Release Ios :"+app4.getStableReleaseIos());
		System.out.println("Stable Release Andriod :"+app4.getStableReleaseAndriod());
		System.out.println("Stable Release Windows :"+app4.getStableReleaseWindows());
		System.out.println("Stable Release Mac Os :"+app4.getStableReleaseMacOs());
		System.out.println("Languages In Ios:"+app4.getLanguagesInIos());
		System.out.println("Languages In Andriod :"+app4.getLanguagesInAndriod());
		System.out.println("Type :"+app4.getType());
		System.out.println("Website :"+app4.getWebsite());
		System.out.println("Size for Ios :"+app4.getSizeForIos());
		System.out.println("Size for Andriod :"+app4.getSizeForAndriod());
		}
	}
