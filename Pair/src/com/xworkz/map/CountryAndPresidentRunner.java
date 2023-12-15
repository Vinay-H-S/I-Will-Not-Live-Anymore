package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.map.dto.CountryDTO;
import com.xworkz.map.dto.PresidentDTO;

public class CountryAndPresidentRunner {

	public static void main(String[] args) {

		CountryDTO countryDTO1 = new CountryDTO(1, "India");
		CountryDTO countryDTO2 = new CountryDTO(2, "USA");
		CountryDTO countryDTO3 = new CountryDTO(3, "UAE");
		CountryDTO countryDTO4 = new CountryDTO(4, "Europe");
		CountryDTO countryDTO5 = new CountryDTO(5, "Sri-lanka");

		PresidentDTO presidentDTO1 = new PresidentDTO(1, "Narendra Modi");
		PresidentDTO presidentDTO2 = new PresidentDTO(2, "Chandan V");
		PresidentDTO presidentDTO3 = new PresidentDTO(3, "Harshith Kumar N R");
		PresidentDTO presidentDTO4 = new PresidentDTO(4, "Darshan R");
		PresidentDTO presidentDTO5 = new PresidentDTO(5, "Venu Gopal");

		Map<CountryDTO, PresidentDTO> countryAndPresident = new HashMap<CountryDTO, PresidentDTO>();
		countryAndPresident.put(countryDTO1, presidentDTO1);
		countryAndPresident.put(countryDTO2, presidentDTO2);
		countryAndPresident.put(countryDTO3, presidentDTO3);
		countryAndPresident.put(countryDTO4, presidentDTO4);
		countryAndPresident.put(countryDTO5, presidentDTO5);

		Set<CountryDTO> keys = countryAndPresident.keySet();
		keys.forEach(p -> System.out.println(p));

		System.out.println("------------------------------------------");

		Collection<PresidentDTO> values = countryAndPresident.values();
		values.forEach(p -> System.out.println(p));

		System.out.println("---------------------------------------------");

		Set<Entry<CountryDTO, PresidentDTO>> entrySet = countryAndPresident.entrySet();
		entrySet.forEach(p->System.out.println(p));
		
		System.out.println("---------------------------------------------------------");
		
		Iterator<Entry<CountryDTO, PresidentDTO>>	itr=entrySet.iterator();
		while(itr.hasNext()) {
		Entry<CountryDTO, PresidentDTO>	itrr=itr.next();
		System.out.println(itrr);
		}

		System.out.println("---------------------------------------------------------");
		
		countryAndPresident.forEach((k,v)->System.out.println(k+" "+v));
	}
}
