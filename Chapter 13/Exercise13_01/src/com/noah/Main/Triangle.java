package com.noah.Main;

public class Triangle extends GeometricObject {
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
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}
	public double getArea() {
		double base = side1 + side3;
		double height = side2 + (side1 + side3);
		double area = (height * base)/2;
		return area;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

