package com.noah.Main;

public class Main {
	
	public static double gcd(double m, double n) {
		
		if(m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}

	}
	
	public static void main(String[] args) {
		System.out.println(gcd(3, 5));
	}

}
