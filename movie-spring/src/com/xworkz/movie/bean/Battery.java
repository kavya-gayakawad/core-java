package com.xworkz.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	private Capacity capacity;
	public Battery() {
		
		System.out.println("creating battery constructor");
	}
		public Capacity capacity2() {
			Capacity capacity =new Capacity ();
			return capacity;
			
		}
		
}
