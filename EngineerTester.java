package com.xworkz.engineer.engineerapp;

import com.xworkz.engineer.Engineer;
import com.xworkz.engineer.cs.CsEngineer;
import com.xworkz.engineer.engineerapp.ec.EcEngineer;

public class EngineerTester {
	
	//polymorphism
	//1.compiletime polymorphism - method Overloading
	//2.runtime polymorphism
	
	public static void main(String[]args) {
		
	Engineer engineer = new EcEngineer();
	
	engineer.solveProblems();
	
	Engineer engi = new CsEngineer();
	engi.solveProblems();
	

	
	}
}
