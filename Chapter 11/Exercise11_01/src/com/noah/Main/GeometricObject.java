package com.noah.Main;

import java.util.Date;

public class GeometricObject {
	private Date d = new Date();
	private String color;
	private boolean filled;
	private String dateCreated;
	
	public GeometricObject() {
		color = "black";
		filled = false;
		dateCreated = d.toString();
	}
	public GeometricObject(String color, boolean filled) {
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
	public String createDescription() {
		String desc = "Color: " + color +
					  "\nFilled: " + filled +
				      "\nDate Created: " + getDateCreated();
		return desc;
	}
}
