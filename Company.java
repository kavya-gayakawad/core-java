package com.xworkz.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {

	

	public static void main(String[] args) {
		

		Map<String, String>map = new HashMap();
		map.put("Microsoft", "Systemsoftware");
		map.put("Wipro", "Applicationsoftware");
		map.put("Capgemini", "Firmware");
		map.put("Axis", "Shareware");
		map.put("Accenture", "javaSoftware");
		map.put("Accuvate", "SQL");
		map.put("TCS", "Webtechnology");
		map.put("Oracle", "PLsql");
		map.put("SAP", "Freeware");
		map.put("IBM", "Opensourcesoftware");

     System.out.println(map);
		
		System.out.println(map.size());
		if(map.isEmpty()) {
			
		}
		else {
			System.out.println("It is empty");
			}
		Set<String>keys = map.keySet();
		keys.forEach(e->System.out.println(e));
		
		Collection<String>values=map.values();
		values.forEach(v->System.out.println(v));
		
//		Set<Entry<String, Integer>> entries = map.entrySet();
		
//		for(Entry<String, Integer>entry:entries) {
//			System.out.println(entry.getkey()+ " " +entry.getValues);
		
		
			
			
		
	}




	}


