package com.devJava.L_progFuncional.exe05.util;

import java.util.List;
import java.util.function.Predicate;

import com.devJava.L_progFuncional.exe05.entities.Product;

public class ProductService {

	public double FilteredSum(List<Product> list, Predicate<Product> criteria) {
		
		 double sum = 0.0;
		 
		 for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		 
		 
		 return sum;
		 
	 }
}
