package com.noah.Main;

import java.util.Scanner;

public class Main {
	
	public static void prompt() {
		Scanner input = new Scanner(System.in);
		int[] array = createArray();
		
		System.out.print("Enter an index (0 - 99): ");
		int index = input.nextInt();
		
		try {
			System.out.println(array[index]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds Exception! Array index " + index + " does not exist.\n");
			prompt();
			
		}
	}
	
	public static int[] createArray() {
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		return array;
	}
	public static void main(String[] args) {
		prompt();
	}
}
