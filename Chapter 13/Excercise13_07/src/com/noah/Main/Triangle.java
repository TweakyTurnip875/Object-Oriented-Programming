package com.noah.Main;
 
public class Triangle extends GeometricObject implements Colorable {
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
	public Triangle(double side1, double side2, double side3, String color, boolean filled, boolean colorable) {
		super(color, filled, colorable);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}
	@Override
	public double getArea() {
		double base = side1 + side3;
		double height = side2 + (side1 + side3);
		double area = (height * base)/2;
		return area;
	}
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	@Override
	public void howToColor() {
		System.out.println("Color all three sides");
	}

	
}

