package com.devJava.C_construtoresEncapsulamento.exe01.application;

import java.util.Locale;
import java.util.Scanner;

import com.devJava.C_construtoresEncapsulamento.exe01.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// System.out.println(product.name);
		// System.out.println(product.price);
		// System.out.println(product.quantity);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println();

		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();

		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		// usar dados privates com get e set
		/// product.setName("kiko);
		// product.getName();

		sc.close();

	}

}
