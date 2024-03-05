package com.devJava.J_interfaces.ex02.application;

import java.util.Locale;
import java.util.Scanner;

import com.devJava.J_interfaces.ex02.model.entities.AbstractShape;
import com.devJava.J_interfaces.ex02.model.entities.Circle;
import com.devJava.J_interfaces.ex02.model.entities.Rectangle;
import com.devJava.J_interfaces.ex02.model.enums.Color;

public class Program02 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
