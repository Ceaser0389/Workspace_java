package application4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities4.Product4;
import util4.UpperCaseName;



public class Program4 {

	public static void main(String[] args) {
	
		
		 List<Product4> list = new ArrayList<>();
		 
		 list.add(new Product4("Tv",900.0));
		 list.add(new Product4("Mouse",50.0));
		 list.add(new Product4("Tablet",350.50));
		 list.add(new Product4("HD Case",90.90));
		
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
