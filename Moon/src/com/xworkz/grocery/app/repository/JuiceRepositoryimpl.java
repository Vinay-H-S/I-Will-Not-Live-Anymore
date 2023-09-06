package com.xworkz.grocery.app.repository;

public class JuiceRepositoryimpl implements JuiceRepository {

	private String[] juices = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(String juice) {
		System.out.println("invoking store data to " + this.getClass().getSimpleName());
		if (position < TOTAL_ITEMS) {
			this.juices[position] = juice;
			System.out.println("Stored " + juice + " at position " + this.position);
			this.position++;
		} else {
			System.out.println("Stored juice item is more than total items..");
		}
	}
	//{Bindu Jeera,null,null,null,null}
	@Override
	public boolean isExist(String juice) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.juices[index];//Bindu Jeera
			if (temp != null && temp.equals(juice)) {
				System.out.println("Juice name is already exist");
				return true;
			}
		}
		return false;
	}

}
