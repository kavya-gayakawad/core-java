package com.xworkz.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoesSize {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> shoes = new ArrayList<Integer>();
		
		shoes.add(30);
		shoes.add(31);
		shoes.add(32);
		shoes.add(33);
		shoes.add(34);
		shoes.add(35);
		shoes.add(36);
		shoes.add(37);
		shoes.add(38);
		shoes.add(39);
		shoes.add(40);
		shoes.add(41);
		shoes.add(42);
		shoes.add(43);
		shoes.add(44);
		shoes.add(45);
		
		
		Iterator<Integer> i = shoes.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Integer element: shoes) {
			System.out.println(element);
		}
	}

}
