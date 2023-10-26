package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {

		Collection<Long> numbers = new ArrayList<Long>();
		numbers.add(70262202424L);
		numbers.add(96864578213L);
		numbers.add(87545964695L);
		numbers.add(88875459656L);
		numbers.add(78964513665L);
		numbers.add(77785456965L);
		numbers.add(12654866866L);
		numbers.add(23452168987L);
		numbers.add(45213624521L);
		numbers.add(44454666646L);
		numbers.add(78545969559L);
		numbers.add(78546964125L);
		numbers.add(75413695455L);
		numbers.add(77785496567L);
		numbers.add(42123652545L);
		numbers.add(75421269855L);
		numbers.add(45213632656L);
		numbers.add(45854696655L);
		numbers.add(45245225666L);
		numbers.add(78945213323L);

		System.out.println("Total Numbers :"+numbers.size());
		
		Iterator<Long> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Long num = iterator.next();
			System.out.println("Numbers :"+num);
		}

	}
}
