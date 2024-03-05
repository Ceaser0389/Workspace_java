package com.devJava.L_progFuncional.exe04.util;

import java.util.function.Function;

import com.devJava.L_progFuncional.exe04.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
