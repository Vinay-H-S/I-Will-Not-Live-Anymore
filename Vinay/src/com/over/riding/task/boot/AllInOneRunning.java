package com.over.riding.task.boot;

import com.over.riding.task.app.*;

public class AllInOneRunning {

	public static void main(String[] args) {
		System.out.println("----------BAKERY-----------");
		Bakery sweet=new NammaBakery();
		sweet.food();
		sweet.food("Namma Bakery");
		sweet.food("Namma Bakery","Bhadravathi");
		sweet.food("Namma Bakery","Bhadravathi",6);
		sweet.food("Namma Bakery","Bhadravathi",6,14000);
		sweet.food("Namma Bakery","Bhadravathi",6,14000,2);
		System.out.println("\n");
		NammaBakery sweet2=new NammaBakery();
		sweet2.food();
		sweet2.food("Namma Bakery");
		sweet2.food("Namma Bakery","Bhadravathi");
		sweet2.food("Namma Bakery","Bhadravathi",6);
		sweet2.food("Namma Bakery","Bhadravathi",6,14000);
		sweet2.food("Namma Bakery","Bhadravathi",6,14000,2);
		
		System.out.println("\n");
		System.out.println("----------HOSPITAL-----------");
		System.out.println("\n");
		
		Hospital health=new GovtHospital();
		health.care();
		health.care("Life care");
		health.care("Life care","Nanjappa");
		health.care("Life care","Nanjappa",25);
		health.care("Life care","Nanjappa",25,50);
		health.care("Life care","Nanjappa",25,50,"General Hospital");
		System.out.println("\n");
		GovtHospital health1=new GovtHospital();
		health1.care();
		health1.care("Life care");
		health1.care("Life care","Nanjappa");
		health1.care("Life care","Nanjappa",25);
		health1.care("Life care","Nanjappa",25,50);
		health1.care("Life care","Nanjappa",25,50,"General Hospital");
		
		System.out.println("\n");
		System.out.println("----------HOTEL-----------");
		System.out.println("\n");
		
		Hotel taste=new SevenstarHotel();
		taste.fiveStar();
		taste.fiveStar("Venkateshawra");
		taste.fiveStar("Venkateshawra","Honnali");
		taste.fiveStar("Venkateshawra","Honnali",true);
		taste.fiveStar("Venkateshawra","Honnali",true,15);
		taste.fiveStar("Venkateshawra","Honnali",true,15,"Harshith Kumar");
		System.out.println("\n");
		SevenstarHotel taste1=new SevenstarHotel();
		taste.fiveStar();
		taste.fiveStar("Venkateshawra");
		taste.fiveStar("Venkateshawra","Honnali");
		taste.fiveStar("Venkateshawra","Honnali",true);
		taste.fiveStar("Venkateshawra","Honnali",true,15);
		taste.fiveStar("Venkateshawra","Honnali",true,15,"Harshith Kumar");
		
		System.out.println("\n");
		System.out.println("----------MALL-----------");
		System.out.println("\n");
		
		Mall town=new CityMall();
		town.floor();
		town.floor("City Center");
		town.floor("City Center",1995);
		town.floor("City Center",1995,5);
		town.floor("City Center",1995,5,25000);
		town.floor("City Center",1995,5,25000,"Hubli");
		System.out.println("\n");
		CityMall town1=new CityMall();
		town1.floor();
		town1.floor("City Center");
		town1.floor("City Center",1995);
		town1.floor("City Center",1995,5);
		town1.floor("City Center",1995,5,25000);
		town1.floor("City Center",1995,5,25000,"Hubli");
		
		System.out.println("\n");
		System.out.println("----------THEATER-----------");
		System.out.println("\n");
		
		Theater film=new StandardTheater();
		film.movie();
		film.movie("Renuka Theater");
		film.movie("Renuka Theater",5);
		film.movie("Renuka Theater",5,"Kabza");
		film.movie("Renuka Theater",5,"Kabza",10);
		film.movie("Renuka Theater",5,"Kabza",10,250);
		System.out.println("\n");
		StandardTheater film1=new StandardTheater();
		film1.movie();
		film1.movie("Renuka Theater");
		film1.movie("Renuka Theater",5);
		film1.movie("Renuka Theater",5,"Kabza");
		film1.movie("Renuka Theater",5,"Kabza",10);
		film1.movie("Renuka Theater",5,"Kabza",10,250);
		
		System.out.println("\n");
		System.out.println("----------TEMPLE-----------");
		System.out.println("\n");
		
		Temple devotional=new GoldTemple();
		devotional.god();
		devotional.god("Eshwara Temple");
		devotional.god("Eshwara Temple","Kailasa");
		devotional.god("Eshwara Temple","Kailasa",7);
		devotional.god("Eshwara Temple","Kailasa",7,15);
		devotional.god("Eshwara Temple","Kailasa",7,15,1955);
		System.out.println("\n");
		GoldTemple devotional1=new GoldTemple();
		devotional1.god();
		devotional1.god("Eshwara Temple");
		devotional1.god("Eshwara Temple","Kailasa");
		devotional1.god("Eshwara Temple","Kailasa",7);
		devotional1.god("Eshwara Temple","Kailasa",7,15);
		devotional1.god("Eshwara Temple","Kailasa",7,15,1955);
		
		System.out.println("\n");
		System.out.println("----------POLICE STATION-----------");
		System.out.println("\n");
		
		PoliceStation police=new BigPoliceStation();
		police.cell();
		police.cell("Balaji Nagara");
		police.cell("Balaji Nagara",14);
		police.cell("Balaji Nagara",14,5);
		police.cell("Balaji Nagara",14,5,10);
		police.cell("Balaji Nagara",14,5,10,"1989 15th july");
		System.out.println("\n");
		BigPoliceStation police1=new BigPoliceStation();
		police1.cell();
		police1.cell("Balaji Nagara");
		police1.cell("Balaji Nagara",14);
		police1.cell("Balaji Nagara",14,5);
		police1.cell("Balaji Nagara",14,5,10);
		police1.cell("Balaji Nagara",14,5,10,"1989 15th july");
		
		System.out.println("\n");
		System.out.println("----------ZOO-----------");
		System.out.println("\n");
		
		Zoo place=new OldZoo();
		place.protect();
		place.protect("Lion Safari");
		place.protect("Lion Safari","Tavare-Koppa");
		place.protect("Lion Safari","Tavare-Koppa",150);
		place.protect("Lion Safari","Tavare-Koppa",150,610);
		place.protect("Lion Safari","Tavare-Koppa",150,610,1945);
		System.out.println("\n");
		OldZoo place1=new OldZoo();
		place1.protect();
		place1.protect("Lion Safari");
		place1.protect("Lion Safari","Tavare-Koppa");
		place1.protect("Lion Safari","Tavare-Koppa",150);
		place1.protect("Lion Safari","Tavare-Koppa",150,610);
		place1.protect("Lion Safari","Tavare-Koppa",150,610,1945);
		
		System.out.println("\n");
		System.out.println("----------PUB-----------");
		System.out.println("\n");
		
		Pub moon=new NightPub();
		moon.party();
		moon.party("Moon Light");
		moon.party("Moon Light",2);
		moon.party("Moon Light",2,5);
		moon.party("Moon Light",2,5,true);
		moon.party("Moon Light",2,5,true,"Ranchi");
		System.out.println("\n");
		NightPub moon1=new NightPub();
		moon1.party();
		moon1.party("Moon Light");
		moon1.party("Moon Light",2);
		moon1.party("Moon Light",2,5);
		moon1.party("Moon Light",2,5,true);
		moon1.party("Moon Light",2,5,true,"Ranchi");
		
		System.out.println("\n");
		System.out.println("----------MARKET-----------");
		System.out.println("\n");
		
		Market sante=new BigMarket();
		sante.sell();
		sante.sell("Sante bajar");
		sante.sell("Sante bajar","Shirola");
		sante.sell("Sante bajar","Shirola",25);
		sante.sell("Sante bajar","Shirola",25,true);
		sante.sell("Sante bajar","Shirola",25,true,250);
		System.out.println("\n");
		BigMarket sante1=new BigMarket();
		sante1.sell();
		sante1.sell("Sante bajar");
		sante1.sell("Sante bajar","Shirola");
		sante1.sell("Sante bajar","Shirola",25);
		sante1.sell("Sante bajar","Shirola",25,true);
		sante1.sell("Sante bajar","Shirola",25,true,250);
		
		System.out.println("\n");
		System.out.println("----------STERRT-----------");
		System.out.println("\n");
		
		Street street=new RajStreet();
		street.road();
		street.road("Bangar Raju Street");
		street.road("Bangar Raju Street",10.6);
		street.road("Bangar Raju Street",10.6,25000000);
		street.road("Bangar Raju Street",10.6,25000000,"Eagle");
		street.road("Bangar Raju Street",10.6,25000000,"Eagle",2014);
		System.out.println("\n");
		RajStreet street1=new RajStreet();
		street1.road();
		street1.road("Bangar Raju Street");
		street1.road("Bangar Raju Street",10.6);
		street1.road("Bangar Raju Street",10.6,25000000);
		street1.road("Bangar Raju Street",10.6,25000000,"Eagle");
		street1.road("Bangar Raju Street",10.6,25000000,"Eagle",2014);
		
		System.out.println("\n");
		System.out.println("----------HOSTEL-----------");
		System.out.println("\n");
		
		Hostel hostel=new BigHostel();
		hostel.jail();
		hostel.jail("Jain Hostel");
		hostel.jail("Jain Hostel","Davanagere");
		hostel.jail("Jain Hostel","Davanagere",3);
		hostel.jail("Jain Hostel","Davanagere",3,15);
		hostel.jail("Jain Hostel","Davanagere",3,15,70000);
		System.out.println("\n");
		BigHostel hostel1=new BigHostel();
		hostel1.jail();
		hostel1.jail("Jain Hostel");
		hostel1.jail("Jain Hostel","Davanagere");
		hostel1.jail("Jain Hostel","Davanagere",3);
		hostel1.jail("Jain Hostel","Davanagere",3,15);
		hostel1.jail("Jain Hostel","Davanagere",3,15,70000);
		
	}

}
