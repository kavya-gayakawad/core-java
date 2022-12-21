package com.xworkz.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
	
	public static void main(String args[]) {
		
		ArrayList<String> animal=new ArrayList<String>();
		
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Fox");
		animal.add("Yak");
		animal.add("Dog");
		animal.add("Camel");
		animal.add("Elephant");
		animal.add("Kangaroo");
		animal.add("Cat");
		animal.add("Deer");
		
		Iterator<String>i = animal.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String element : animal) {
			System.out.println(element);
		}
		
		
		
		
	}

}
