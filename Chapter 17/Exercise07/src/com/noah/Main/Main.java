package com.noah.Main;

import java.io.*;

public class Main {
	
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (
            ObjectOutputStream output = new ObjectOutputStream(new 
            FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        outputData("Exercise17_07.dat");
    }
    
    public static void outputData(String name) throws ClassNotFoundException, IOException {
    	try (
    		ObjectInputStream in = new ObjectInputStream(new 
    		FileInputStream(name));
    	) {
    		while(true) {
	    		Loan l = (Loan)in.readObject();
	    		
	    		System.out.println(l.getLoanAmount());
    		}

    	} catch(EOFException ex) {
    		System.out.println("-- End of file reached --");
    	}
    	
    }
}
