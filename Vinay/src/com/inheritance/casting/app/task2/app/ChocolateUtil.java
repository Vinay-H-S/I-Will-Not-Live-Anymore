package com.inheritance.casting.app.task2.app;

public class ChocolateUtil {
	
	public static void sweet(Chocolate choco)
	{
		System.out.println(choco.type);
		choco.sugar();
		
		if(choco instanceof DarkChocolate)
		{
			DarkChocolate taste=(DarkChocolate)choco;
			System.out.println("Chocolate Type :"+taste.viscosity);
			taste.dark();
		}
		if(choco instanceof CaramelChocolate)
		{
			CaramelChocolate taste1=(CaramelChocolate)choco;
			System.out.println("Iconic Character :"+taste1.ioconicCharacter);
			taste1.caramel();
		}

	}

}
