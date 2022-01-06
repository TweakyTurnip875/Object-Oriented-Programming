package com.noah.Main;

import java.util.Date;

public class Account {
	Date d = new Date();
	
	private double balance;
	private int id;
	private double annualInterestRate;
	private String dateCreated;
	
	public Account() {
		balance = 0;
		id = 0;
		annualInterestRate = 0;
		dateCreated = d.toString();
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = d.toString();
	}
	
	// encapsulation methods
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	
	// utility methods
	public double getMonthlyInterest() {
		double decimal = annualInterestRate / 100;
		double res = decimal / 12;
		return res;
	}
	public double getMonthlyInterestRate(double income) {
		return income * getMonthlyInterest();
	}
	public void withdraw(double amount) {
		this.balance -= amount;
		System.out.print(this.balance);
	}
	public void deposit(double amount) {
		this.balance += amount;
		System.out.print(this.balance);
	}
	
}
