package com.xworkz.animal;

import java.util.ArrayList;
import java.util.Iterator;

public class SoftwareCompany {
	public static void main(String args[]) {
	
	ArrayList<String> software = new ArrayList<String>();
	
	software.add("MicroSoft");
	software.add("Oracle");
	software.add("IBM");
	software.add("Sap");
	software.add("Autodesk");
	software.add("Splunk");
	software.add("Vmware");
	software.add("Dell");
	software.add("HP");
	software.add("BMC");
	software.add("Twillio");
	software.add("Capgemini");
	software.add("TCS");
	software.add("Accenture");
	software.add("Cognizant");
	software.add("EY");
	software.add("MU sigma");
	software.add("Accuvate");
	software.add("Axis Tech");
	software.add("Wipro");
	
	Iterator<String> i = software.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	for(String element : software) {
		System.out.println(element);
	}
	
	
	

	}
}
