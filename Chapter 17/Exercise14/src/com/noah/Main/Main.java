package com.noah.Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		prompt();
	}
	public static void prompt() {
		Scanner userInputStream = new Scanner(System.in);
		
		System.out.print("Enter input file name: ");
		String inFileName = userInputStream.next();
		
		System.out.print("Enter output file name: ");
		String outFileName = userInputStream.next();
		
		File inputFile = new File(inFileName);
		File outputFile = new File(outFileName);
		
	}
	public static void createFile(String name) throws FileNotFoundException {
		try (
			DataOutputStream out = new DataOutputStream(
			new FileOutputStream(name + ".dat"));
		) {
			out.writeInt(32);
			out.writeInt(56);
			out.writeInt(12);
			
			System.out.println("file created");
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void encryptData() {
		
	}
}
