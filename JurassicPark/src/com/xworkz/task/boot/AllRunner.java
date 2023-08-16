package com.xworkz.task.boot;

import com.xworkz.task.app.*;

public class AllRunner {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------LOGO-------------------------------");
		
		
		Logo logo=new Logo("Logo Maker","Gaming Logo",true,2004,"LogoMix inc");
		System.out.println(logo);
		System.out.println("\n");
		
		Logo logo2=new Logo("Wix","Brand Logo",false,2014,"wix inc");
		System.out.println(logo2);
		System.out.println("\n");
		
		Logo logo3=new Logo("Mecablada","Popular Logos and Brands",true,2019,"Mecablda pro inc");
		System.out.println(logo3);
		System.out.println("\n");
		
		System.out.println("-------------------------------------KERCHIEF-------------------------------");
		
		Kerchief kerchief=new Kerchief();
		System.out.println(kerchief);
		System.out.println("\n");
		
		Kerchief kerchief2=new Kerchief("Handfell","Cotton",25,true,"Hand Kerchief",'S',"Kuber mart industry");
		System.out.println(kerchief2);
		System.out.println("\n");
		
		Kerchief kerchief3=new Kerchief("Smooth Flow","Woolen",60,true,"Hand Kerchief",'M',"Silk park pvt");
		System.out.println(kerchief3);
		System.out.println("\n");
		
		System.out.println("-------------------------------------FLAG-------------------------------");
		
		Flag flag=new Flag();
		System.out.println(flag);
		System.out.println("\n");
		
		Flag flag2=new Flag("India",3,"Polyster");
		System.out.println(flag2);
		System.out.println("\n");
		
		Flag flag3=new Flag("United Arab Emirates",4,"Cotton Fabric");
		System.out.println(flag3);
		System.out.println("\n");
		
		System.out.println("-------------------------------------CAVE-------------------------------");
		
		Cave cave=new Cave();
		System.out.println(cave);
		System.out.println("\n");
		
		Cave cave2=new Cave("Ajanta Ellora Caves","Maharashtra",34,6,1983,"Buddisum, Hinduism and Jainism");
		System.out.println(cave2);
		System.out.println("\n");
		
		Cave cave3=new Cave("Bagh Cave","Madhya Pradesh",20,6,1990,"Buddisum");
		System.out.println(cave3);
		System.out.println("\n");
		
		System.out.println("-------------------------------------PENDENT-------------------------------");
		
		Pendent pendent=new Pendent();
		System.out.println(pendent);
		System.out.println("\n");
		
		Pendent pendent2=new Pendent("GIVA",false,"Lobster","Sterling Silver","Cubic Zirconia","Cube",925,6,"High",2899,"Giva jewellary");
		System.out.println(pendent2);
		System.out.println("\n");
		
		Pendent pendent3=new Pendent("NOVA",false,"Ster","Silver Gix Gold","Magnetic","Round",896,6,"Medium",3499,"Nova jewellary");
		System.out.println(pendent3);
		
		
	}

}
