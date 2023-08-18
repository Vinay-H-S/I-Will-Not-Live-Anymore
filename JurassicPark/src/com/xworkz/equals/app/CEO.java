package com.xworkz.equals.app;

public class CEO {

	private String companyName;
	private String CEO;
	private int noOfCompanies;
	private int noOfEmployes;
	private String location;
	private String companyType;

	public CEO() {
	}

	public CEO(String companyName, String CEO, int noOfCompanies, int noOfEmployes, String location,
			String companyType) {
		super();
		this.companyName = companyName;
		this.CEO = CEO;
		this.noOfCompanies = noOfCompanies;
		this.noOfEmployes = noOfEmployes;
		this.location = location;
		this.companyType = companyType;
	}

	@Override
	public String toString() {

		return "Company Name :" + companyName + "CEO :" + CEO + "No Of Comapanies :" + noOfCompanies
				+ "No Of Employess :" + noOfEmployes + "Location :" + location + "Comapany Type :" + companyType;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not equals to null..");
			if (obj instanceof CEO) {
				System.out.println("obj is instance of CEO");
				CEO ceo = (CEO) obj;
				if (ceo.companyName.equals(companyName) && ceo.CEO.equals(CEO)) {
					System.out.println("object and properties is same..");
				} else {
					System.out.println("object and properties is not same...");
				}
			} else {
				System.out.println("obj is not of CEO..");
			}
		} else {
			System.out.println("obj is equals to null...");
		}
		return false;
	}
}
