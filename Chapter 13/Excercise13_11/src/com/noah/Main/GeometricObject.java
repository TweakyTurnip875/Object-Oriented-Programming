package com.noah.Main;

import java.util.Date;

public abstract class GeometricObject {
	private Date d = new Date();
	private String color;
	private boolean filled;
	private String dateCreated;
	
	protected GeometricObject() {
		color = "black";
		filled = false;
		dateCreated = d.toString();
	}
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = d.toString();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	
	public abstract double getArea();
	
	@Override
	public String toString() {
		String desc = "Color: " + color +
					  "\nFilled: " + filled +
					  "\nArea: " + getArea() +
				      "\nDate Created: " + getDateCreated();
					  
		return desc;
	}
}
