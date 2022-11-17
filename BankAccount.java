package com.xworkz.bankapp.bank;

public class BankAccount {
	// name,ifscCode, branchName,accountNo
	public String name;
	String ifscCode;
	String branchName;
	String accountNo;
	private double balance;
	
	
	
	
	public double withDraw(double balance) {
		this.balance = this.balance-balance;
		return this.balance;
		
	}
	public double deposit(double balance) {
		System.out.println("Amount to be deposited" + balance);
		//0.0 + 5000.
		this.balance = this.balance + balance;
		return this.balance;
	}
	public void transfer(double amount, BankAccount friendsAccount) {
	System.out.println("Transferring to Friend's Account");
	withDraw(amount);
	friendsAccount.deposit(amount);
	System.out.println("Transferring Done..Transaction Successfull");

}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}
