package com.devJava.k_generics.exe02.service;

import java.util.List;


public class CalculationService  {

	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be emty");
			
		}
		T max = list.get(0);
		for (T item :list) {
			if(item.compareTo(max) > 0);
				max= item;	
		}
		
		return max;
		
	}
	
	/**
	 * 
	 * esse meu metodo vai trab com qualquer tipo  T desde  que o T seja qualquer 
	 * sub tipo de Comparable<T>
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
