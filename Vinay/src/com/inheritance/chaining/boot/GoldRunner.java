package com.inheritance.chaining.boot;

import com.inheritance.chaining.app.*;

public class GoldRunner {
	
	public static void main(String[] args) {
		
		Gold rate=new Gold("KDM",5300,"MMTC-PAMP india pvt ltd",true);
		
		System.out.println("Gold Name :"+rate.name);
		System.out.println("Prize :"+rate.prize);
		System.out.println("Sold By :"+rate.soldBy);
		System.out.println("Purest :"+rate.purest);
	
		System.out.println("----------------------");
		
		PureGold rate1=new PureGold();
		System.out.println("Gold Name :"+rate.name);
		System.out.println("Prize :"+rate.prize);
		System.out.println("Sold By :"+rate.soldBy);
		System.out.println("Purest :"+rate.purest);
		
		
		
	}

	
	
}
