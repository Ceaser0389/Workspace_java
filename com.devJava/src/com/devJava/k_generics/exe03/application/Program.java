package com.devJava.k_generics.exe03.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
	 List<?> myObjs = new ArrayList<>();
	 List<Integer> myNumbers = new ArrayList<>();
	 
	 myObjs = myNumbers;
	 
	 Object obj;
	 Integer x = 10;
	 obj =x;
		
		
		
		
	/**
	 * ? curinga é super tipo de qualquer lista 
	 * 
	 */
			
	}

}
