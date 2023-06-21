package util4;

import java.util.function.Function;

import entities4.Product4;


public class UpperCaseName implements Function<Product4, String> {

	@Override
	public String apply(Product4 p) {
		
		return p.getName().toUpperCase();
	}

	
	

}
