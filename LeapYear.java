package com.xworkz.coding;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if(y%100!=0 && y%4==0) {
		 System.out.print("Leap year");
	}
		else {
			System.out.print("not Leap year");
		}
		sc.close();
	}

}
