package com.xworkz.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chocolate {

	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap();
		map.put("DairyMilk", 100);
		map.put("Bournville", 75);
		map.put("Kisses", 150);
		map.put("Fabell", 130);
		map.put("perk", 80);
		map.put("crunch", 60);
		map.put("Fuse", 50);
		map.put("Munch", 10);
		map.put("Chocos fills", 90);
		map.put("Kitkat", 170);

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



