package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		double result = calculadora.divideDoisNumeros(20, 2);
		System.out.println(result);
		System.out.println(calculadora.divideDoisNumeros(20, 0));
		System.out.println("--------------------------");
		calculadora.imprimeDivisaoDeDoisNumeros(86,0);
		
		
		
		
		
		
		
		
		
		
	}

}
