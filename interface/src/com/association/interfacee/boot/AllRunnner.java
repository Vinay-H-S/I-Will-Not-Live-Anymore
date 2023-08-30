package com.association.interfacee.boot;

import com.association.interfacee.app.*;
import com.association.interfacee.impl.*;

public class AllRunnner {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("----------------------INTERNET--------------------------");
		System.out.println("\n");
		
		Internet internet=new FireFoxBrowser();

		
		Browser browser=new Browser();
		browser.setInternet(internet);
		browser.connect();
		
		System.out.println("\n");
		System.out.println("--------------PASSPORT-VERIFICATION-------------");
		System.out.println("\n");
		
		PassportVerification verification=new PassportNo2();
		
		Custom custom=new Custom();
		custom.setVerification(verification);
		custom.verifyCitizen();
		
		System.out.println("\n");
		System.out.println("----------------------WINESHOP----------------------");
		System.out.println("\n");
		
		WineShop shop=new KingfisherStrong();
		
		Beer beer=new Beer();
		beer.setWineshop(shop);
		beer.drinkBeer();
		
		System.out.println("\n");
		System.out.println("----------------------ARMY--------------------------");
		System.out.println("\n");
		
		Army army=new AndamanNicobarCommand();
		
		AirForce airForce=new AirForce();
		airForce.setArmy(army);
		airForce.protect();
		
		System.out.println("\n");
		System.out.println("----------------------POLICE-STATION--------------------------");
		System.out.println("\n");
		
		PoliceStation station=new DeputySuperintendentOfPolice();
		
		SubInspector inspector=new SubInspector();
		inspector.setPolice(station);
		inspector.service();
	}

}
