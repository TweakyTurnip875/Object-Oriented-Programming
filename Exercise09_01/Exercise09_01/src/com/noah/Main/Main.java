package com.noah.Main;

import com.noah.Main.Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println(
			"Rectangle one:\n" + "\n" +
			"Width: " + r.width + "\n" + 
			"Height: " + r.height + "\n" +
			"Area: " + r.getArea() + "\n" +
			"Perimeter: " + r.getPerimeter() + "\n"
		);
		
		System.out.println(
				"\nRectangle two:\n" + "\n" +
				"Width: " + r2.width + "\n" + 
				"Height: " + r2.height + "\n" +
				"Area: " + r2.getArea() + "\n" +
				"Perimeter: " + r2.getPerimeter() + "\n"
		);
	}

}
