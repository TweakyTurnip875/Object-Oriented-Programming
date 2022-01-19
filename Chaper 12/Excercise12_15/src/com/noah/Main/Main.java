package com.noah.Main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		File file = new File("Exercise12_15.txt");
		
		
		if(file.exists()) {
			System.out.println("File already exists.");
			System.exit(0);
		}
		
		try(
			PrintWriter w = new PrintWriter(file);
			
		) {
			for(int i = 0; i < 100; i++) {
				w.println((int)(Math.random() * 100));
				
			}
		}
		Scanner r = new Scanner(file);
		
		for(int i = 0; i < 100; i++) {
			System.out.println(r.nextLine());
		}
	}
}
