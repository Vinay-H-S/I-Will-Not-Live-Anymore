package com.xworkz.Jacket.app.Repository;

public class JacketRepositoryimpl implements JacketRepository {

	int[] discount=new int[TOTAL_PRICE_LIST];
	int offer;
	
	@Override
	public void priceList(int price) {
		System.out.println("invoking pricelist in JacketRepositoryimpl..");
		if(offer<TOTAL_PRICE_LIST)
		{
			this.discount[offer]=price;
			System.out.println("Stored Price list "+price +" in position "+this.discount);
			this.offer++;
		}
		else
		{
			System.err.println("Stored price list is more than total price list...");
		}
	}

}
