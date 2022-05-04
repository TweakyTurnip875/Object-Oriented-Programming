package com.noah.Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		prompt();
	}
	public static void prompt() throws IOException {
		Scanner userInputStream = new Scanner(System.in);
		
		System.out.print("Enter input file name: ");
		String inFileName = userInputStream.next();
		
		File inF = new File(inFileName + ".dat");
		createFile(inF);
		
		System.out.print("Enter output file name: ");
		String outFileName = userInputStream.next();
		
		File outF = new File(outFileName + ".dat");
		encryptData(inF, outF);
	}
	public static void createFile(File name) throws FileNotFoundException {
		try (
			DataOutputStream out = new DataOutputStream(
			new FileOutputStream(name));
		) {
			out.writeDouble((int)(Math.random() * 100));
			out.writeDouble((int)(Math.random() * 100));
			out.writeDouble((int)(Math.random() * 100));
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void encryptData(File inFile, File outFile) throws IOException {
		
		try(
			DataInputStream in = new DataInputStream(new FileInputStream(inFile));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(outFile));
		) {
			while(true) {
				out.writeDouble(in.readDouble() + 5);
			}
		} catch(EOFException ex) {
			System.out.println("End of file reached");
		}
		
	}
}
