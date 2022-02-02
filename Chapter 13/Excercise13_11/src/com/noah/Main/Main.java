package com.noah.Main;

import com.noah.Main.*;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(50);
		Octagon o2 = (Octagon)o1.clone();
		
		System.out.println("Octagon 1 sides are equal to Octogon 2 sides: " + (o1.compareTo(o2) == 1));
		System.out.println("\n" + o1.toString());
	}

}
