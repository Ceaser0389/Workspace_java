package com.devJava.k_generics.exe05.application;

import com.devJava.k_generics.exe05.entities.Client;

public class Program {
  
	public static void main(String[] args) {
	
		
		Client c1 = new Client("Maria","maria@gmail.com");
		Client c2 = new Client("Alex","alex@gmail.com");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));  // compara o conteudo
		System.out.println();
		
		System.out.println(c1 == c2); //comprara as ref de memoria
		System.out.println();
		
		String s1 = "Test";
		String s2 = "Test";  // o copilador da um tratamento especial por isso da true
		
		System.out.println(s1== s2);
		
		
		
		
		
		
   }
}
