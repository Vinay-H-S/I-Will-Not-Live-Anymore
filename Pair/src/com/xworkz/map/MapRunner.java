package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		Map<String, Long> nameAndAdhar = new HashMap<String, Long>();
		nameAndAdhar.put("Vinay H S", 489507757894L);
		nameAndAdhar.put("Jeevan K", 7896512365455L);
		nameAndAdhar.put("Harshith N R", 78125634985L);
		nameAndAdhar.put("Darshan R", 9641256556656L);
		nameAndAdhar.put("Venu Gopal", 785416487894L);
		nameAndAdhar.put("Chandan V", 8899507757894L);
		nameAndAdhar.put("Yallalinga", 3626507757894L);
		nameAndAdhar.put("Prajwal", 96457757894L);
		nameAndAdhar.put("Navven Mokka", 452107757894L);
		nameAndAdhar.put("Praveen K", 6312546699566L);

		System.out.println(nameAndAdhar.size());
		System.out.println(nameAndAdhar.isEmpty());

		Set<String> adharName = nameAndAdhar.keySet();
		adharName.forEach(a -> System.out.println(a));

		System.out.println("----------------------------------");
		
		Collection<Long> adharNumber = nameAndAdhar.values();
		adharNumber.forEach(n -> System.out.println(n));
	}

}
