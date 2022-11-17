package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.bank.savings.SavingsAccount;

public class BankAccountTester {
	public static void main(String[]args) {
		
		BankAccount account = new BankAccount();
		account.deposit(5000);
		account.deposit(7000);
		account.withDraw(1000);
		
		SavingsAccount savingsAccount = new SavingsAccount();
	    savingsAccount.deposit(4000);
	    savingsAccount.deposit(7000);
	    savingsAccount.withDraw(1000);
	    
	    CurrentAccount currentAccount = new CurrentAccount();
	    currentAccount.deposit(3000);
	    currentAccount.deposit(4000);
	    currentAccount.withDraw(1000);
	    
	    System.out.println("My Account Balance is"+account.getBalance());
		System.out.println("My SavingsAccount Balance is"+ savingsAccount.getBalance());
		System.out.println("My CurrentAccount Balance is"+ currentAccount.getBalance());
		
		
		BankAccount friendsAccount = new BankAccount();
		friendsAccount.deposit(700);
		friendsAccount.deposit(4000);
		friendsAccount.deposit(5000);
		
		account.transfer(500.00, friendsAccount);
		System.out.println("My Account Balance is" + account.getBalance());
		System.out.println("The Friend's account balance is" + friendsAccount.getBalance());
		
		SavingsAccount maaSavingsAccount = new SavingsAccount();
		maaSavingsAccount.deposit(1000);
		savingsAccount.transfer(4000,maaSavingsAccount);
		

		System.out.println("My Savings Account Balance is" + savingsAccount.getBalance());
		System.out.println("My mom's Savings Account Balance is" + maaSavingsAccount.getBalance());
		
		CurrentAccount brotherCurrentAccount = new CurrentAccount();
		brotherCurrentAccount.deposit(2000);
		brotherCurrentAccount.transfer(3000, brotherCurrentAccount);
		
		System.out.println("My Current Account Balance is"+ currentAccount.getBalance());
		System.out.println("My brother's CurrentAccount Balance is" + brotherCurrentAccount.getBalance());
		
		
		SavingsAccount savingsAccount2 = new SavingsAccount(0.7);
		savingsAccount2.deposit(1000);
		savingsAccount2.periodicInterest();
	    System.out.println(savingsAccount2.getBalance());
		
		
		
		//System.out.println("My Savings Account Balance is" + savingsAccount.balance);
		//System.out.println("My mom's Savings Account Balance is" + maaSavingsAccount.balance);
		//System.out.println("My brother's CurrentAccount Balance is" + brotherCurrentAccount.balance);
		
		
		
		
		//String dullAccount = null;
		//Transferring amount from my account to Friends Account
		account.transfer(500.00, friendsAccount);
		//System.out.println("My Account Balance is" + account.balance);
		//System.out.println("The Friend's account balance is" + friendsAccount.balance);
		
		
		
		//double withDrawAmount = account.withDraw(400);
		//System.out.println("Thank you for WithDrawing" + withDraw);
		//System.out.println(account.balance);
	}

}
