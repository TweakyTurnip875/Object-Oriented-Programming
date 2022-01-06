package com.noah.Main;

public class Triangle {
	private double side1, side2, side3;
	
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String createTriangleDescription() {
		String desc = "\nTriangle: \nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
		return desc;
	}
}
