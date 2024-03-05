package com.devJava.L_progFuncional.exe04.appplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devJava.L_progFuncional.exe04.entities.Product;

public class Program {

	public static void main(String[] args) {
		

		 List<Product> list = new ArrayList<>();
		 
		 list.add(new Product("Tv",900.0));
		 list.add(new Product("Mouse",50.0));
		 list.add(new Product("Tablet",350.50));
		 list.add(new Product("HD Case",90.90));
		
		 //exemplo interface
		//List<String> names = list.stream()
		//		.map(new UpperCaseName()).collect(Collectors.toList());
		
		// metodo static na classe
		 //List<String> names = list.stream()
			//		.map(Product4::staticUpperCase).collect(Collectors.toList());	 
		 
		 
		 // metodo não static
		 //List<String> names = list.stream()
			//	.map(Product4::nonStaticUpperCase).collect(Collectors.toList());	
		 
		 
		 // lambda declarada
		// Function<Product4, String> func = p -> p.getName().toUpperCase();
		// List<String> names = list.stream()
		//	.map(func).collect(Collectors.toList());	
		 
		
		// lambda inline
		List<String> names = list.stream()
				.map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
