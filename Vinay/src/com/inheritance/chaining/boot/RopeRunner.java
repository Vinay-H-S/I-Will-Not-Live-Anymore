package com.inheritance.chaining.boot;

import com.inheritance.chaining.app.*;

public class RopeRunner {

	public static void main(String[] args) {
		Rope hope=new Rope("Orange",460,480,"Plastic");
		System.out.println("Rope color :"+hope.color);
		System.out.println("Length :"+hope.length);
		System.out.println("Prize :"+hope.prize);
		System.out.println("Type :"+hope.type);
		
		System.out.println("-----------------------");
		
		NylonRope hope1=new NylonRope();
		System.out.println("Rope color :"+hope1.color);
		System.out.println("Length :"+hope1.length);
		System.out.println("Prize :"+hope1.prize);
		System.out.println("Type :"+hope1.type);
		
		
	}

}
