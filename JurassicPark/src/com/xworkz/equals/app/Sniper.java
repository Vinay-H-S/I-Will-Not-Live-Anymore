package com.xworkz.equals.app;

public class Sniper {

	private String sniperGunName;
	private String sniperName;
	private int range;
	private double contractPrice;
	private String targetName;
	private int gunNo;
	
	public Sniper() {
	}

	public Sniper(String sniperGunName, String sniperName, int range, double contractPrice, String targetName,
			int gunNo) {
		super();
		this.sniperGunName = sniperGunName;
		this.sniperName = sniperName;
		this.range = range;
		this.contractPrice = contractPrice;
		this.targetName = targetName;
		this.gunNo = gunNo;
	}
	
	@Override
	public String toString() {
		return "Sniper Gun Name :"+sniperGunName+"Sniper Name :"+sniperName+"Range :"+range+"Contarct Price :"+contractPrice+"Target Name :"+targetName+"Gun Number :"+gunNo;
		}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("obj is equals to null..");
			if(obj instanceof Sniper)
			{
				System.out.println("obj is instance of Sniper..");
				Sniper sniper=(Sniper)obj;
				if(sniper.sniperGunName.equals(sniperGunName)&&sniper.sniperName.equals(sniperName)&&sniper.range==this.range)
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}
			}
			else
			{
				System.out.println("obj is not of Sniper...");
			}
		}
		else
		{
			System.out.println("obj is equals is not equals to null..");
		}
		return false;
	}
}
