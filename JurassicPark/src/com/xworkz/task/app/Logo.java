package com.xworkz.task.app;

public class Logo {

	private String companyName;
	private String logoType;
	private boolean freeLogoMaker;
	private int founded;
	private String parentOrganization;
	
	public Logo() {
	}
	
	public Logo(String companyName,String logoType,boolean freeLogoMaker,int founded,String parentOrganization)
	{
		this.companyName=companyName;
		this.logoType=logoType;
		this.freeLogoMaker=freeLogoMaker;
		this.founded=founded;
		this.parentOrganization=parentOrganization;
	}
	
	@Override
	public String toString() {
		return "Logo Maker :"+companyName+ "Logo Type :"+logoType+"Free Logo Maker :"+freeLogoMaker+"Founded :"+founded+"Parent Organization :"+parentOrganization;
	}
}
