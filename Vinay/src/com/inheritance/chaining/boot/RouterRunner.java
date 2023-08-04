package com.inheritance.chaining.boot;
import com.inheritance.chaining.app.*;
public class RouterRunner {

	public static void main(String[] args) {
		
		Router net=new Router("ACT","2.8GHz",1,4200);
		System.out.println("Brand :"+net.brand);
		System.out.println("Frequency Band :"+net.frequencyBandClass);
		System.out.println("Warranty :"+net.warranty);
		System.out.println("Prize :"+net.prize);
		
		System.out.println("------------------------------------------");
		
		ProRouter net1=new ProRouter();
		System.out.println("Brand :"+net1.brand);
		System.out.println("Frequency Band :"+net1.frequencyBandClass);
		System.out.println("Warranty :"+net1.warranty);
		System.out.println("Prize :"+net1.prize);
	}

}

