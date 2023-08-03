package com.inheritance.casting.app.task2.boot;

import com.inheritance.casting.app.task2.app.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate cream=new Chocolate();
		DarkChocolate cream1=new DarkChocolate();
		CaramelChocolate cream2=new CaramelChocolate();
		
		ChocolateUtil.sweet(cream);
		System.out.println("------------------");
		ChocolateUtil.sweet(cream1);
		System.out.println("------------------");
		ChocolateUtil.sweet(cream2);
		System.out.println("------------------");
		

	}

}
