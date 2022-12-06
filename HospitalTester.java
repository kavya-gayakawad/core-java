package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.hospitalapp.Hospital;
import com.xworkz.hospital.hospitalapp.Patient;  
import com.xworkz.hospital.hospitalapp.constant.Gender;

public class HospitalTester {

	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Patient name");
		String patientName = sc.next();
		
		System.out.println("Enter Patient address");
		String address = sc.next();
		

		System.out.println("Enter Patient age");
		int age =sc.nextInt();
		
//		Patient patient =new Patient(patientName, address, Gender.male, age);
//		Hospital hos = new Hospital();
//		hos.IsEmergency=false;
//		hos.isTreatmentRequired=false;
//		boolean isAdmitted = hos.adm/it(patient);
//		System.out.println(isAdmitted);
//		System.out.println(patient.gender);
		
      	sc.close();
	}
	
		
}