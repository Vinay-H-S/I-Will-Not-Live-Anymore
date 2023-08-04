package com.inheritance.chaining.boot;

import com.inheritance.chaining.app.*;

public class GroundRunner {

	public static void main(String[] args) {
		
		Ground play=new Ground("Woodmate Ground","6th ward 2nd cross NR Pura",577462,"PlayGround");
		System.out.println("Ground name :"+play.name);
		System.out.println("Location :"+play.location);
		System.out.println("Pincode :"+play.pincode);
		System.out.println("Type :"+play.type);
		
		System.out.println("-----------------------");
		
		PlayGround play1=new PlayGround();
		System.out.println("Ground name :"+play1.name);
		System.out.println("Location :"+play1.location);
		System.out.println("Pincode :"+play1.pincode);
		System.out.println("Type :"+play1.type);
	
		
	}
}
