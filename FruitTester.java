package com.xworkz.fruit;

import com.xworkz.fruit.fruitapp.Apple;
import com.xworkz.fruit.fruitapp.Fruit;
import com.xworkz.fruit.fruitapp.Mango;

public class FruitTester {
	
	public static void main(String args[]) {
		
		Fruit fruit = new Mango();
		fruit.getNutrition();
		
		Fruit fru = new Apple();
		fru.getNutrition();
		
	}

}
