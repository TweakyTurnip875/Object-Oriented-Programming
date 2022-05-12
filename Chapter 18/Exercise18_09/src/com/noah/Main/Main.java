package com.noah.Main;

public class Main {
	
	public static void main(String[] args) {
		reverseDisplay("hello world");
	}
	
	public static void reverseDisplay(String s) {
		
		System.out.print(s.charAt(s.length() - 1));
		
		if(!(s.length() <= 1)) {
			reverseDisplay(s.substring(0, s.length() - 1));
		}
	}
	
}
