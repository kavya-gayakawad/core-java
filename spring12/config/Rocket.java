package com.xworkz.spring12.config;

@Component
public class Rocket {
	@Value("India") 
	private String country;
	
	@Value("ArayaBhata")
	private String name;
	
	@Vlaue("3000000.0")
	private Double Budget;
	
	public Rocket() {
		
		System.out.println("creating a object of Rocket");
	}
	
	public Double getBudget() {
		return Budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	

}
