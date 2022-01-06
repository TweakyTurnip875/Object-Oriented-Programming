package com.noah.Main;

public class SavingAccount extends Account {
	
	private Account a;
	
	public SavingAccount() {
		a = new Account();
	}
	public SavingAccount(int id, double balance) {
		a = new Account(id, balance);
	}
	
	public void withdraw(double amount) {
		a.setBalance(a.getBalance() - amount);
		System.out.println("New Saving Account Balance: " + a.getBalance());
	}
	
	public void getInfo() {
		System.out.println(
				"Saving Account ID: " + a.getId() + 
			    "\nBalance: " + a.getBalance()
				);
	}
}
