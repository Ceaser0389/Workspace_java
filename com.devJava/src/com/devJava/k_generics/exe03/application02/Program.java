package com.devJava.k_generics.exe03.application02;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.println(obj);
		}
   }
	
  /**
   *  não é possível add dados para um tipo curinga, pq a list é de qualquer tipo
   *  o compilador não deixa
   *  
   *  
   *  
   */
 
	
}
