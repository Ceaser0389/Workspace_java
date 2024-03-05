package com.devJava.L_progFuncional.exe03.util;

import java.util.function.Consumer;

import com.devJava.L_progFuncional.exe03.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
	
		p.setPrice(p.getPrice() * 1.1);
	}

}
