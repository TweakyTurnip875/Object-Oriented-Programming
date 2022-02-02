package com.noah.Main;

import com.noah.Main.Triangle;

public class Main {

	public static void main(String[] args) {
		Triangle[] t = new Triangle[5];
		
		for(int i = 0; i < t.length; i++) {
			t[i] = new Triangle(60.0, 60.0, 60.0, "blue", true, true);
			
			if(t[i].isColorable()) {
				System.out.println("area: " + t[i].getArea());
				t[i].howToColor();
			}
		}
	}

}
