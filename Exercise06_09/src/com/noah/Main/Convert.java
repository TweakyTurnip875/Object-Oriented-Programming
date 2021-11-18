package com.noah.Main;

public class Convert {
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
	public static void main(String[] args) {
		System.out.printf("%s\t %s\t\t %s\t %s\n", "Feet", "Meter", "Meter", "Feet");
		System.out.println("---------------------------------------");
		for(double i = 1; i <= 10; i++) {
			double rowThree = (15 + (i * 5));
			System.out.printf("%.1f\t %.3f\t\t %.1f\t %.3f\n", i, footToMeter(i), rowThree, meterToFoot(rowThree));
			
		}
	}
}
