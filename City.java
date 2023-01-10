package com.xworkz.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		

		Map<String, Integer>map = new HashMap();
		map.put("Bengaloore", 560063);
		map.put("Bagalkot", 587101);
		map.put("Gaddanakeri", 587103);
		map.put("Vidyagiri", 587102);
		map.put("Rajajinagar", 560010);
		map.put("Vijayanagar", 560040);
		map.put("Mudhol", 587313);
		map.put("Gadag", 581107);
		map.put("Mysuru", 570001);
		map.put("Udupi", 574118);

     System.out.println(map);
		
		System.out.println(map.size());
		if(map.isEmpty()) {
			
		}
		else {
			System.out.println("It is empty");
			}
		
		Set<String>keys = map.keySet();
		keys.forEach(e->System.out.println(e));
		
		Collection<Integer>values=map.values();
		values.forEach(v->System.out.println(v));
		
//		Set<Entry<String, Integer>> entries = map.entrySet();
		
//		for(Entry<String, Integer>entry:entries) {
//			System.out.println(entry.getkey()+ " " +entry.getValues);
		
		
			
			
		
	}




	}


