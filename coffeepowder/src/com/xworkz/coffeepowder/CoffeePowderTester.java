package com.xworkz.coffeepowder;

import com.xworkz.coffeepowder.coffeepowderapp.CoffeePowder;

public class CoffeePowderTester {
	public static void main(String[] args) {
		
		CoffeePowder cof = new CoffeePowder();
		cof.visit("cofee shop");
		System.out.println("visit to" + cof.fresh);
		
		CoffeePowder ref = new CoffeePowder();
		ref.toGetCoffee("relaxation", ref);
		System.out.println("to get" + ref.fresh);
		
		CoffeePowder temp = new CoffeePowder();
		temp.toGetCoffee("energy", ref);
		System.out.println("we get " + temp.fresh);
	}

}
