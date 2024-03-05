package com.devJava.L_progFuncional.exe02.application;

import java.util.ArrayList;
import java.util.List;

import com.devJava.L_progFuncional.exe02.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		 
		 list.add(new Product("Tv",900.00));
		 list.add(new Product("Mouse",50.00));
		 list.add(new Product("Tablet",350.00));
		 list.add(new Product("HD Case",80.90));
			
		   // versão 1 com interface
		  /// list.removeIf( new ProductPredicate());
		 
		  // versão 2 com metodo na classe
		  // list.removeIf(Product2 :: staticProductPredicate); // ref p metodo
		 
		  // versão 3  com metodo na classe não estatico
		  //list.removeIf(Product2 :: nonStaticProductPredicate);
		 
		  
		  // versão 4 versão lambda declarada
		   double min = 100.0;
		 	 //Predicate<Product2> pred = p -> p.getPrice() >= min;
		    // list.removeIf(pred);
		     
		  // versão 5 versão lambda inline
		     list.removeIf(p -> p.getPrice() >= min);
		     
		     
		 
		 for (Product p : list) {
			System.out.println(p);
		}
		 
		 
		 

	}

}
