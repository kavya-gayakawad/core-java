package com.xworkz.sweets;

import java.util.ArrayList;

public class Sweets {
	
	public static void main(String args[]) {
		
		ArrayList<String> sweet = new ArrayList<String>();
		
		
		sweet.add("Barfi");
		sweet.add("Gulab Jamun");
		sweet.add("Kaji katli");
		sweet.add("Rasgulla");
		sweet.add("Rasmalai");
		sweet.add("Soan Papadi");
		sweet.add("Modak");
		sweet.add("Balusha");
		sweet.add("Boondi");
		sweet.add("Jalebi");
		sweet.add("Ladoo");
		sweet.add("Basundi");
		sweet.add("Mysore Pak");
		sweet.add("Badam ka Halwa");
		sweet.add("Peda");
		sweet.add("Kheer");
		
		
		System.out.println(sweet);
		
		sweet.clear();
		
		System.out.println(sweet.size());
	}

}
