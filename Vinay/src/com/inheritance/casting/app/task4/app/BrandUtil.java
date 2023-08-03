package com.inheritance.casting.app.task4.app;
public class BrandUtil{

	public static void items(Brand brand)
	{
		System.out.println(brand.type);
		brand.product();
		
		if(brand instanceof LocalBrand)
		{
			LocalBrand item=(LocalBrand)brand;
			System.out.println(item.name);
			item.local();
		}
		
		if(brand instanceof DuplicateBrand)
		{
			DuplicateBrand item1=(DuplicateBrand)brand;
			System.out.println(item1.name);
			item1.duplicate();
		}
		
		if(brand instanceof NationalBrand)
		{
			NationalBrand item2=(NationalBrand)brand;
			System.out.println(item2.name);
			item2.national();
		}
		
		if(brand instanceof InternationalBrand)
		{
			InternationalBrand item3=(InternationalBrand)brand;
			System.out.println(item3.name);
			item3.international();
		}
		
		
		
		
		
	}
	
	
}