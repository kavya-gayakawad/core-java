package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodItemComponent {
	
	public FoodItemComponent() {
	System.out.println("created "+this.getClass().getSimpleName());
	}

	
	@PostMapping
	public String onSend(@RequestParam String name, @RequestParam String type,
	@RequestParam int quantity, @RequestParam double price) {
		System.out.println("Running OnSend post");
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		return "fooditem.jsp";

}
}
