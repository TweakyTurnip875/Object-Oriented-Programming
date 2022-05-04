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
		encryptPrompt();
	}
	
	// write randomly generated data to a File object.
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
	// Reads from inFile object, encrypts data, and writes encrypted data to outFile object
	public static void encryptData(File inFile, File outFile) throws IOException {
		try(
			DataInputStream in = new DataInputStream(new FileInputStream(inFile));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(outFile));
		) {
			// runs until an EOFException is reached in catch
			while(true) {
				out.writeDouble(in.readDouble() + 5); // encrypts data by adding 5 to every byte of inFile and writing to outFile
			}
		} catch(EOFException ex) {
			System.out.println("--- File encrypted ---");
		}
		
	}
	
	//prompt user to enter a template filename with non encrypted data and an output file with encrypted input file data
	public static void encryptPrompt() throws IOException {
		Scanner userInputStream = new Scanner(System.in);
		
		System.out.print("Enter input file name: ");
		String inFileName = userInputStream.next();
		
		// create input file object with users input.
		// file extension added to the end in case user doesn't include the correct extension.
		File inF = new File(inFileName + ".dat");
		
		createFile(inF); // call createFile to write template data to input file
		
		System.out.print("Enter output file name: ");
		String outFileName = userInputStream.next();
		
		// same process as the input file creation for output file
		File outF = new File(outFileName + ".dat");
		
		encryptData(inF, outF);
	}
}
