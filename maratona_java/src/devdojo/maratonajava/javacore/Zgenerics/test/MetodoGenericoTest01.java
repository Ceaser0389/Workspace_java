package devdojo.maratonajava.javacore.Zgenerics.test;


import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class MetodoGenericoTest01 {

	public static void main(String[] args) {
	
	   criarArrayComUmObj(new Barco("Canoa Marota"));
	 
			

	}

	
	
	private static <T> void criarArrayComUmObj(T t) {
		List<T> list = List.of(t);
		System.out.println(list);
	}


}

