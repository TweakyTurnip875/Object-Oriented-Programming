package com.noah.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class FileData {
	private String fileName;
	private String location;
	
	FileData(String fileName) {
		this.fileName = fileName;
	}
	FileData(String fileName, String location) {
		this.fileName = fileName;
		this.location = location;
		
		validateLocation();
	}
	private void validateLocation() {
		if(location.charAt(location.length() - 1) != '/'){
			location = location.concat("/");
		}
	}
	
	public void createDataFile() throws IOException {
		if(location != null) {
			fileName = location.concat(fileName);
		}
		File f = new File(fileName);
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		
		if(f.exists()) {
			
			out.writeInt(56);
		} 
	}
}
