package com.xworkz.crud.app.repository;

public class MobileNoRepositoryimpl implements MobileNoRepository{
	
	private long numbers[]=new long[TOTAL_MOBILE_NO_S];
	private int position;
	
	
	@Override
	public void save(long mobileNo) {
		System.out.println("invoking mobile data in "+this.getClass().getSimpleName());
		if(position<TOTAL_MOBILE_NO_S)
		{
			
			this.numbers[position]=mobileNo;
			System.out.println("Stored "+mobileNo+" at position "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("Stored number is more than total mobile no..");
		}
		
	}
	
	@Override
	public boolean isExist(long mobileNo) {
		for(int index=0;index<this.position ;index++)
		{
			long temp=this.numbers[index];
			if(temp!=0 && temp==mobileNo)
			{
				System.err.println("Mobile no is exist...");
			}
		}
		return false;
	}

}
