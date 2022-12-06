package com.xworkz.hospital.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospital.hospitalapp.constant.ApolloHospital;
import com.xworkz.hospital.hospitalapp.constant.Gender;

public class ApolloHospitalTester {
	
		public static void main(String args[]) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size");
			int size = sc.nextInt();
			

			ApolloHospital apo = new ApolloHospital(size);
			
			for(int i=0; i<=size; i++) {
				Patient pat = new Patient();
			System.out.println("Enter the patient name");
			pat.setPatientName(sc.next());
			
			System.out.println("Enter the patient age");
			pat.setAge(sc.nextInt());
			
			System.out.println("Enter the patient gender");
			String gender = sc.next();
			pat.setGender(Gender.valueOf(gender));
			
			System.out.println("Enter the patient address");
		    pat.setAddress(sc.next());
			
			apo.addPatient(pat);
			
			apo.getAllPatients();
			sc.close();
	}

	}
	}

	