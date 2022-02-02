package com.noah.Main;

import java.lang.Cloneable;
import java.lang.Comparable;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		super(color, filled);
		
		this.side = side;
	}
	
	@Override 
	public double getArea() {
		double area = (2 + 4/Math.sqrt(2)) * side * side;
		return area;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Octagon o = new Octagon(side);
		
		return super.clone();
	}
	@Override
	public int compareTo(Octagon o) {
		if(side == o.side) {
			return 1;
		} else {
			return 0;
		}
	}
}
