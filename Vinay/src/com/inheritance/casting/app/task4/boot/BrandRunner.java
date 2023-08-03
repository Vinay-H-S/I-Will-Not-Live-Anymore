package com.inheritance.casting.app.task4.boot;

import com.inheritance.casting.app.task4.app.*;

public class BrandRunner {

	public static void main(String[] args) {
		Brand item=new Brand();
		LocalBrand item1=new LocalBrand();
		DuplicateBrand item2=new DuplicateBrand();
		NationalBrand item3=new NationalBrand();
		InternationalBrand item4=new InternationalBrand();
		BrandUtil.items(item);
		System.out.println("----------------------------");
		BrandUtil.items(item1);
		System.out.println("----------------------------");
		BrandUtil.items(item2);
		System.out.println("----------------------------");
		BrandUtil.items(item3);
		System.out.println("----------------------------");
		BrandUtil.items(item4);

	}

}
