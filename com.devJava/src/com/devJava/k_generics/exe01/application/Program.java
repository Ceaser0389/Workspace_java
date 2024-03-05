package com.devJava.k_generics.exe01.application;

import java.util.Scanner;

import com.devJava.k_generics.exe01.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  
	  PrintService<Integer> ps = new PrintService<>();
	  
	  System.out.println("How many values");
	  int n = sc.nextInt();
	  
	  for(int i= 0; i< n ; i++) {
		  int value = sc.nextInt();
		  ps.addValue(value);
	  }
		
	  ps.print();
	  System.out.println("First: " + ps.First());

	  
	  // com generics vc elimina o uso type safe e cast
	}

}
