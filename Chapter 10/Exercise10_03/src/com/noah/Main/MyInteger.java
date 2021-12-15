package com.noah.Main;

import java.util.Arrays;

public class MyInteger {
	private int value;
	
	/*
	 * these are variables for isPrime() function
	 * 
	 * This function uses recursion to check if the variable value is prime or not for each
	 * number up to itself. Variable i is supposed to be incremented but if I place it inside the
	 * function it doesn't work because each time the function is called it gets set back to it's
	 * original value so that is why they are up here.
	 * 
	 * Could probably use a loop or something rather than recursion but I just wanted to 
	 * practice using different tools.
	 */
	private static boolean res;
	private static int i = 1;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		return value % 2 == 0;
	}
	public boolean isOdd() {
		return isEven() == false;
	}
	public boolean isPrime() {
		i++;
		if(value % i != 0 && value > i) {
			if(value > i) {
				isPrime();
			}
		} else if(value % i == 0){
			if(value == i) {
				res = true;
			} else {
			res = false;
			}
		}
		return res;
	}
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	public static boolean isOdd(int value) {
		return isEven(value) == false;
	}
	public static boolean isPrime(int value) {
		i++;
		if(value % i != 0 && value > i) {
			if(value > i) {
				isPrime(value);
			}
		} else if(value % i == 0){
			if(value == i) {
				res = true;
			} else {
			res = false;
			}
		}
		return res;
	}
	public static boolean isEven(MyInteger m) {
		return isEven(m.getValue());
	}
	public static boolean isOdd(MyInteger m) {
		return isEven(m.getValue()) == false;
	}
	public static boolean isPrime(MyInteger m) {
		i++;
		if(m.getValue() % i != 0 && m.getValue() > i) {
			if(m.getValue() > i) {
				isPrime(m.getValue());
			}
		} else if(m.getValue() % i == 0){
			if(m.getValue() == i) {
				res = true;
			} else {
			res = false;
			}
		}
		return res;
	}
	public boolean equals(int value) {
		return value == this.value;
	}
	public boolean equals(MyInteger m, int value) {
		return value == m.getValue();
	}
	public static void parseInt(char[] array) {
		int res = 0;
		int[] resArr = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			Arrays.fill(resArr, array[i]);;
			System.out.println(resArr[i]);
		}
		
	}
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}
}