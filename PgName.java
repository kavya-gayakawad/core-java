package com.xworkz.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class PgName {
	
	public static void main(String args[]) {
		
		
		Map<String, Integer> map = new HashMap();
		
		map.put("Golden pg", 5250);
		map.put("Manjunath pg", 5450);
		map.put("Yamuna pg", 5000);
		map.put("Ganga pg", 5060);
		map.put("Krishna pg", 5400);
		map.put("Akshata pg", 5500);
		map.put("Laxmi pg", 5350);
		map.put("manjula pg", 6050);
		map.put("Abhishek pg", 6000);
		map.put("Nishma pg", 5470);
		map.put("Priya pg", 4250);
		map.put("Vasantha pg", 6250);
		map.put("Brundha pg", 5550);
		
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


