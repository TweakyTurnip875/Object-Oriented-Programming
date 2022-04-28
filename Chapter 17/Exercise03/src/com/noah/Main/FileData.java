package com.noah.Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
	/* (make sure the file location is valid)
	 * 
	 *  if the last character in the file location isn't a forward slash, then,
	 *  add forward slash to the end of the file location
	 */
	private void validateLocation() {
		if(location.charAt(location.length() - 1) != '/'){
			location = location.concat("/");
		}
	}
	
	// creates a placeholder .dat file
	public void createDataFile() throws IOException {
		String fileInfo = ""; // readable file info (location, name, etc.)
		
		// if location is provided, add it to the end of fileInfo
		if(location != null) {
			fileInfo = location.concat(fileInfo);
		}
		fileInfo += fileName; // add file name to the end of fileInfo
		
		File f = new File(fileInfo);
		
		// if file already exists, write to data file, otherwise, create the file
		if(f.exists()) {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
			
			for(int i = 0; i < 100; i++) {
				out.writeDouble((int)(Math.random() * 20));
			}
		} else {
			f.createNewFile();
		}
	}
	
	// getters and setters
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
