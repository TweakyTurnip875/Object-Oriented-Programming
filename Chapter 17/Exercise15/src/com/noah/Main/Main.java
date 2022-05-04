package com.noah.Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		decryptPrompt();
	}

	public static void decrypt(File inFile, File outFile) throws FileNotFoundException, IOException {
		try (
			DataInputStream in = new DataInputStream(new FileInputStream(inFile));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(outFile));
		) {
			
		} catch(EOFException ex) {
			
		}
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
