package com.noah.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void createFile(String name) throws IOException { // default location (current directory)
		File f = new File(name);
		FileWriter fw = new FileWriter(f.getAbsolutePath(), true);
		
		// append 100 random integers to the file separated by a space
		for(int i = 0; i < 100; i++) {
			fw.append((int)(Math.random() * 20) + " ");
		}
		fw.append("\n"); // start a new line after every 100 integers
		fw.close();
		
		System.out.println(f.getAbsolutePath());
	}
	public static void createFile(String name, String location) throws IOException { // custom location

		File f = new File(location + "/" + name);
		FileWriter fw = new FileWriter(f.getAbsolutePath(), true);
		
		// append 100 random integers to the file separated by a space
		for(int i = 0; i < 100; i++) {
			fw.append((int)(Math.random() * 20) + " ");
		}
		fw.append("\n"); // start a new line after every 100 integers
		fw.close();
		
		System.out.println(f.getAbsolutePath());
	}
	
	
	public static void main(String[] args) throws IOException {
		createFile("name.txt", "/Users/student/eclipse-workspace/Exercise01/text-files");
	}

}
