package com.devJava.B_introPoo.exe02.applicaton;

import java.util.Locale;
import java.util.Scanner;

import com.devJava.B_introPoo.exe02.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println("enter product data:");
		
		System.out.print("Name:");
		product.name = sc.nextLine();
		
		System.out.print("Price");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity");
		product.quantity = sc.nextInt();
		
		
		
		System.out.println(product.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();	
		
		
		
		
		
		
		
		
		
		
	}

}
