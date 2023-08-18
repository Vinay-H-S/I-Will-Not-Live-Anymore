package com.xworkz.equals.boot;

import com.xworkz.equals.app.*;;

public class AllInOneRunner {

	public static void main(String[] args) {
		Minister minister=new Minister("BSY",3,"Shikaripura","BJP");
		System.out.println(minister);
		
		Minister minister2=new Minister("Siddu",5,"Varuna","Congress");
		
		boolean same=minister.equals(minister2);
		System.out.println("Contents are same..."+same);
		System.out.println("\n");
		
		System.out.println("-----------CEO------------");
		
		CEO ceo=new CEO("Honey bee","Harshith",6,1200,"Banglore","IT");
		System.out.println(ceo);
		
		CEO ceo2=new CEO("Honey bee","Harshith",2,500,"Mysore","IT");
		
		boolean same1=ceo.equals(ceo2);
		System.out.println("Content are same.."+same1);
		System.out.println("\n");
		
		System.out.println("-----------MECHANIC------------");
		
		Mechanic mechanic=new Mechanic("Jeevan","Car Service","Oil Service",8999,true,"Harshi");
		System.out.println(mechanic);
		
		Mechanic mechanic2=new Mechanic("Jeevan"," Car Service","Oil Service",8999,true,"Venu");
		
		boolean same2=mechanic.equals(mechanic2);
		System.out.println("Content are same..."+same2);
		System.out.println("\n");
		
		System.out.println("-----------SNIPER------------");
		
		Sniper sniper=new Sniper("MK146","Wisk dolby",500,563000,"Rikky",3459);
		System.out.println(sniper);
		
		Sniper sniper2=new Sniper("A146","Alon Walker",899,7822120,"ABD",7899);
		
		boolean same3=sniper.equals(sniper2);
		System.out.println("Content are same...."+same3);
		System.out.println("\n");
		
		System.out.println("-----------KALLA------------");
		
		Kalla kalla=new Kalla("Harshi","N R Pura",54,89,true,true);
		System.out.println(kalla);
		
		Kalla kalla2=new Kalla("Jeevan","Bhadravathi",98,65,true,true);
		
		boolean same4=kalla.equals(kalla2);
		System.out.println("Content are same..."+same4);
		System.out.println("\n");

		System.out.println("-----------COOK------------");
		
		Cook cook=new Cook("Bisibele bath,Puri palya,anna sambar","Marriage",12,true,"Raghu",7899);
		System.out.println(cook);
		System.out.println("\n");
		
		Cook cook2=new Cook("Biibele bath,Puri palya,anna sambar","Marriage",12,true,"Raghu",7899);
	
		boolean same5=cook.equals(cook2);
		System.out.println("Content are same.."+same5);
}
}