package com.noah.Main;

public class CheckingAccount extends Account {
	
	private Account a;
	
	public CheckingAccount() {
		a = new Account();
	}
	public CheckingAccount(int id, double balance) {
		a = new Account(id, balance);
	}
	
	public void withdraw(double amount) {
		if(amount > a.getBalance()) {
			System.out.println("Could not complete this action: Input exceeds balance.");
		} else {
			a.setBalance(a.getBalance() - amount);
			System.out.println("New Checking Account Balance: " + a.getBalance());
		}
	}
	
	public void getInfo() {
		System.out.println(
				"Checking Account ID: " + a.getId() + 
			    "\nBalance: " + a.getBalance()
				);
	}
}
