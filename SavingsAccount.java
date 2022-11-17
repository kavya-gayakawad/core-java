package com.xworkz.bankapp.bank.savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount {
	public String name;
	
	public double interestRate;
	
	public SavingsAccount() {
	System.out.println("saving Account object is created");
	}
	 public SavingsAccount(double interestRate) {
		 System.out.println("saving Account object is created");
	 }
	
	 public void periodicInterest() {
		double newBalance = getBalance() * interestRate/100;
		deposit(newBalance);
	}
	
	
	

}
