package com.devJava.B_introPoo.exe03.application;

import java.util.Locale;
import java.util.Scanner;

import com.devJava.B_introPoo.exe03.entities.Calculator;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter with radius:");
		double radius = sc.nextDouble();
		
		// chamando um membro static 
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		
		System.out.printf("Circumference %.2f%n",c);
		System.out.printf("Volume %.2f%n",v);
		System.out.printf("PI value %.2f%n",Calculator.PI);
		
		
		
		
		
		
		
		sc.close();

	}

}
