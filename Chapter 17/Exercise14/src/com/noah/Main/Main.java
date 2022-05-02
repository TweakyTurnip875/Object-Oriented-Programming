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

	public static void main(String[] args) throws IOException {
		prompt();
	}
	public static void prompt() throws IOException {
		Scanner userInputStream = new Scanner(System.in);
		
		System.out.print("Enter input file name: ");
		String inFileName = userInputStream.next();
		
		createFile(inFileName);
		
		System.out.print("Enter output file name: ");
		String outFileName = userInputStream.next();
		
		File of = new File(outFileName + ".dat");
		of.createNewFile();
		
	}
	public static void createFile(String name) throws FileNotFoundException {
		try (
			DataOutputStream out = new DataOutputStream(
			new FileOutputStream(name + ".dat"));
		) {
			out.writeDouble((int)(Math.random() * 100));
			out.writeDouble((int)(Math.random() * 100));
			out.writeDouble((int)(Math.random() * 100));
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void encryptData() {
		
	}
}
