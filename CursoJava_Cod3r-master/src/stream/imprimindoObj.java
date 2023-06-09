package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObj {

	public static void main(String[] args) {
	
	List<String> aprovados = Arrays.asList("lu","luca","gui","ana");
		
	
	System.out.println("Usanod o forEach");
	for (String nome : aprovados) {
		System.out.println(nome);
	}
	System.out.println("------------------------------------");
	
	System.out.println("Usando Iterator......");  // interface funcional
	 Iterator<String> iterator = aprovados.iterator();
	 while (iterator.hasNext()) {
		 System.out.println(iterator.next());
	}	
		
	System.out.println("------------------------------------");	
	
	System.out.println("Usando Stream......");   // Interface que usa sequancia de dados 
	Stream<String>	stream = aprovados.stream();
	stream.forEach(System.out::print);  // laço interno 
	
	
	
	
	
	
	
	
	
	
	

	}

}
