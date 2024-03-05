package devdojo.maratonajava.javacore.Ycolecoes.test;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {

	public static void main(String[] args) {
		
//		String nome = "Willian Suane";
//		String nome2 = new String( "Willian Suane");
//		
//		System.out.println(nome == nome2);
//		System.out.println(nome.equals(nome2));
		
		
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("1ABC1", "iPhone");
		
		System.out.println(s1.equals(s2));
		
		
		
	}

}
