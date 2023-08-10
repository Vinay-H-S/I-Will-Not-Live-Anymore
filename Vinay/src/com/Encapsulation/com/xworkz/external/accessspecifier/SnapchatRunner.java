package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;


public class SnapchatRunner {
	 public static void main(String[] args) {
		 Snapchat app3=new Snapchat();
			app3.setoriginalAuthor("Reggie Brown,Bobby Murphy,Evan Spiegal");
			app3.setDevelopers("Snap inc");
			app3.setReleaseYear(2011);
			app3.setStableReleaseIos(2023);
			app3.setStableReleaseAndriod(2023);
			app3.setStableReleaseWindows(2023);
			app3.setStableReleaseMacOs(2023);
			app3.setLangugesInIos(45);
			app3.setLangugesInAndriod(54);
			app3.setType("Instant Messaging,photo sharing,video chat");
			app3.setWebsite("www.snapchat.com");
			app3.setSizeForIos(258);
			app3.setSizeForAndriod(64);
			System.out.println("Original Author :"+app3.getOriginalAuthor());
			System.out.println("Developer :"+app3.getDevelopers());
			System.out.println("Release Year :"+app3.getReleaseYear());
			System.out.println("Stable Release Ios :"+app3.getStableReleaseIos());
			System.out.println("Stable Release Andriod :"+app3.getStableReleaseAndriod());
			System.out.println("Stable Release Windows :"+app3.getStableReleaseWindows());
			System.out.println("Stable Release Mac Os :"+app3.getStableReleaseMacOs());
			System.out.println("Languages In Ios:"+app3.getLanguagesInIos());
			System.out.println("Languages In Andriod :"+app3.getLanguagesInAndriod());
			System.out.println("Type :"+app3.getType());
			System.out.println("Website :"+app3.getWebsite());
			System.out.println("Size for Ios :"+app3.getSizeForIos());
			System.out.println("Size for Andriod :"+app3.getSizeForAndriod());
			
	 }

}
