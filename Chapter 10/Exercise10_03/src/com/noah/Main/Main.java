package com.noah.Main;

import com.noah.Main.MyInteger;

public class Main {
	public static void main(String[] args) {
		MyInteger m = new MyInteger(7);
		
		System.out.println(m.isEven());
		System.out.println(m.isOdd());
		System.out.println(m.isPrime() + "\n");
		
		System.out.println(m.isEven(8));
		System.out.println(m.isOdd(7));
		System.out.println(m.isPrime(7) + "\n");
		
		System.out.println(m.isEven(m));
		System.out.println(m.isOdd(m));
		System.out.println(m.isPrime(m) + "\n");
		
		System.out.println(m.equals(7));
		System.out.println(m.equals(m, 7) + "\n");
		
		char[] c = {'1','2','3'};
		
		m.parseInt(c);
		System.out.println("\n" + m.parseInt("45"));

	}

}
