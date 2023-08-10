package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class CredRunner {
	public static void main(String[] args) {
		
		Cred a=new Cred();
		a.setType("Private");
		a.setIndustry("Fincial service");
		a.setFounded(2018);
		a.setFounder("Kunal Shah");
		a.setHeadquaters("Banglore");
		a.getRevenues(393.0);
		a.getNetRevenue(-160);
		a.getNoOfEmployees(800);
		a.getWebsite("www.cred.club");
		a.getUsers(5900000);
		a.getSponers("Fintech,DTS global,Tiger global");
		a.getSponersYear(2012);
		a.getLossesIn2020(360.6);
		a.getLossesIn2021(260.8);
		System.out.println("Type :"+a.getType());
		System.out.println("Industry :"+a.getIndustry());
		System.out.println("Founded :"+a.getFounded());
		System.out.println("Founder :"+a.getFounder());
		System.out.println("HeadQuarter :"+a.getHeadquarters());
		System.out.println("Revenue :"+a.getRevenue());
		System.out.println("Net Revenue :"+a.getNetRevenue());
		System.out.println("No Of Employees :"+a.getNoOfEmployees());
		System.out.println("Website :"+a.getWebsite());
		System.out.println("Users :"+a.getUsers());
		System.out.println("Sponers :"+a.getSponers());
		System.out.println("Sponer year :"+a.getSponersYear());
		System.out.println("Losses in 2020 :"+a.getLossesIn2020());
		System.out.println("Losses in 2021 :"+a.GetLossesIn2021());
		
	}

}
