package com.xworkz.interfac;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	@Override
	public void connect() {
		System.out.println("Jio provider connect");
	}

}
