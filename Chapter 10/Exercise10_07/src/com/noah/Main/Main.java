package com.noah.Main;

import java.util.Scanner;
import com.noah.Main.Account;

public class Main {
	public static Account[] accounts = new Account[10];
	public static Scanner input = new Scanner(System.in);
	
	public static void promptId() {
		boolean res = false;
		
		System.out.print("Please enter a valid id: ");
		int id = input.nextInt();
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getId() == id) {
				res  = true;
			}
		}
		
		if(res != true) {
			promptId();
		} else {
			promptOptions(id);
		}
	}
	public static void promptOptions(int id) {
		System.out.print(
				"\n[1] View balance\n"
				+ "[2] Withdraw\n"
				+ "[3] Deposit\n"
				+ "[4] Exit to main menu\n"
				+ "\n: "
			);
		int option = input.nextInt();
		
		if(option == 1) {
			
			System.out.println("\nbalance: $" + accounts[id].getBalance());
			promptOptions(id);
			
		} else if(option == 2) {
			
			System.out.print("\nAmount: ");
			double amount = input.nextDouble();
			
			accounts[id].withdraw(amount);
			
			System.out.println("New balance: $" + accounts[id].getBalance());
			promptOptions(id);
			
		} else if(option == 3) {
			
			System.out.print("\nAmount: ");
			double amount = input.nextDouble();
			
			accounts[id].deposit(amount);
			
			System.out.println("New balance: $" + accounts[id].getBalance());
			promptOptions(id);
			
		} else if(option == 4) {
			System.out.println();
			promptId();
			System.out.println();
		} else {
			System.out.println("\nInvalid option");
			promptOptions(id);
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		promptId();
	}

}
