package com.noah.Main;

import java.util.Scanner;
import com.noah.Main.*;

public class Main {
	public static CheckingAccount c = new CheckingAccount(1, 100);
	public static SavingAccount s = new SavingAccount(1, 100);
	
	public static void main(String[] args) {
		c.withdraw(150);
		c.withdraw(5);
		s.withdraw(150);
		
		System.out.println();	
		
		c.getInfo();

		System.out.println();
		
		s.getInfo();
	}
}
