package com.xworkz.interfac;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{
	
	@Override
	public void connect() {
		System.out.println("Airtel provider connect");
	}

}
