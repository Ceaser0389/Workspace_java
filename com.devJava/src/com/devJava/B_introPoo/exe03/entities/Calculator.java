package com.devJava.B_introPoo.exe03.entities;

public class Calculator {

	//independente de obj 
		public static final double PI = 3.14159;	
		
		
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * (radius*radius*radius)/3;
		}
}
