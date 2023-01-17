package com.xworkz.interfac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {

	@Autowired
	@Qualifier("airtel")
	public Airtel airtel;
	
	@Autowired
	@Qualifier("jio")
	public Jio jio;
	
	@Override
	public void browse() {
		System.out.println("Firebox browser");
		airtel.connect();
	}
	
}
