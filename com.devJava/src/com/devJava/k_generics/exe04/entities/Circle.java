package com.devJava.k_generics.exe04.entities;

public class Circle  implements Shape{

	private double radius;

	public Circle(double radius) {
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return  Math.PI * radius * radius;
	}
	
	
	
}
