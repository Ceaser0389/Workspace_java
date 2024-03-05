package com.devJava.L_progFuncional.exe03.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.devJava.L_progFuncional.exe03.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		 
		 list.add(new Product("Tv",900.0));
		 list.add(new Product("Mouse",50.0));
		 list.add(new Product("Tablet",350.50));
		 list.add(new Product("HD Case",90.90));
		 
		// list.forEach(new PriceUpdate());
		 
		// list.forEach(Product3 :: staticPriceUpdate);
		 
		//list.forEach(Product3 :: nonStaticPriceUpdate);
		
		double factor = 1.1;
		//Consumer<Product3> cons =  p -> {
		//	p.setPrice(p.getPrice() * factor);
		//};
		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice()* factor);
	    list.forEach(cons);
		
		//list.forEach(p -> p.setPrice(p.getPrice()* factor);
		
		list.forEach(System.out::println);

	}

}
