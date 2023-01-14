package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Director {
 
	private Experience experience;
	public Director () {
		System.out.println("creating director constructor");
	}
	public Experience refOfExperience() {
		Experience experience =new Experience() ;
		 return experience;
		 
	}
}
