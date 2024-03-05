package com.devJava.L_progFuncional.exe02.util;

import java.util.function.Predicate;

import com.devJava.L_progFuncional.exe02.entities.Product;

public class ProductPredicate  implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		
		return  p.getPrice() >= 100.0;
	}

}
