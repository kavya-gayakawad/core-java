package com.xworkz.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class Watch {
	
	public static void main(String args[]) {
		
		ArrayList<String>watch = new ArrayList<String>();
		
		watch.add("Titan");
		watch.add("Fastrack");
		watch.add("HMT");
		watch.add("Mi");
		watch.add("Sonata");
		
		Iterator<String>i = watch.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String element : watch) {
			System.out.println(element);
		}
	}

}
