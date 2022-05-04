package com.noah.Main;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		decryptPrompt();
	}

	public static void decrypt(File inFile, File outFile) {
		
	}
	
	public static void decryptPrompt() {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter input file name: ");
		String inName = user.next();
		
		File inFile = new File(inName + ".dat");
		
		if(inFile.exists()) {

			System.out.print("Enter output file name: ");
			String outName = user.next();
			
			File outFile = new File(outName + ".dat");
			
			decrypt(inFile, outFile);
		
		} else {
			System.out.println(inFile.getName() + " does not exist");
		}

	}
}
