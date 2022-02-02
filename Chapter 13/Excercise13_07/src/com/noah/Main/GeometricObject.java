package com.noah.Main;

import java.util.Date;

public abstract class GeometricObject {
	private Date d = new Date();
	private boolean colorable;
	private String color;
	private boolean filled;
	private String dateCreated;
	
	protected GeometricObject() {
		color = "none";
		filled = false;
		colorable = false;
		dateCreated = d.toString();
	}
	protected GeometricObject(String color, boolean filled, boolean colorable) {
		this.color = color;
		this.filled = filled;
		this.colorable = colorable;
		dateCreated = d.toString();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(colorable) {
			this.color = color;
		} else {
			System.out.println("Geometry is not colorable.");
		}
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		if(colorable) {
			this.filled = filled;
		} else {
			System.out.println("Geometry is not colorable.");
		}
	}
	public boolean isColorable() {
		return colorable;
	}
	public void setColorable(boolean colorable) {
		this.colorable = colorable;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		String desc = "Color: " + color +
					  "\nFilled: " + filled +
					  "\nArea: " + getArea() +
					  "\nPerimeter: " + getPerimeter() +
				      "\nDate Created: " + getDateCreated();
					  
		return desc;
	}
}
