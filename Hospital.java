package com.xworkz.hospital.hospitalapp;

public class Hospital {

	public Patient patient;
	public boolean IsEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted =false;
		
		if(isTreatmentRequired == false ) {
		if(IsEmergency == false) {
			this.patient=patient;
			this.patient.displayInfo();
			System.out.println("Patient can be allowed");
		}
		else {
			System.out.println("Add the patient Name");
		}
	}
	else {
		System.out.println("take rest");
	}
		
	
		return isAdmitted;
		
	}
}
