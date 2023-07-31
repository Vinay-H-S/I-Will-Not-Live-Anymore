package com.association.task.boot;
import com.association.task.app.*;
public class ToothpasteRunner {

	public static void main(String[] args)
	{
		String name="Colgate Strong Teeth";
		String brand="Colgate";

		Company company=new Company("Colgate-palmolive company","Noel R. Wallace","America");
		company.displayInfo();
		Ingredent ingredent=new Ingredent("Limonene",5.8f,45);
		Ingredent ingredent1=new Ingredent("Slica",4.5f,26);
		Ingredent ingredent2=new Ingredent("Sodium Bicarbonate",0.57f,41);
		Ingredent ingredent3=new Ingredent("Calcium Carbonate",0.88f,15);
		Ingredent ingredent4=new Ingredent("Sorbital",2.5f,27);
		Ingredent[] ingredents= {ingredent,ingredent1,ingredent2,ingredent3,ingredent4};
		Toothpaste paste=new Toothpaste(name, brand, brand, ingredents);
		paste.dipalyInfo();
	}
		}