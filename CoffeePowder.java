package com.xworkz.coffeepowder.coffeepowderapp;

public class CoffeePowder {
	
	public String name;
	public String fresh;
	
	public void visit(String fresh) {
		
		System.out.println("visit to " + fresh);
		this.fresh = fresh;
	}
    public void toGetCoffee(String fresh, CoffeePowder ref) {
    	visit(fresh);
    	ref.visit(fresh);
	 
 }
}
