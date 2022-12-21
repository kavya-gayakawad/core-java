package com.xworkz.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class MetroCity {
	
	public static void main(String args[]) {
		
		ArrayList<String>metro = new ArrayList<String>();
		
		metro.add("Mumbai");
		metro.add("Chennai");
		metro.add("Bengaluru");
		metro.add("Pune");
		metro.add("Kolkata");
		
		Iterator<String> i = metro.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String element : metro) {
			System.out.println(element);
		}
		
	}

}
