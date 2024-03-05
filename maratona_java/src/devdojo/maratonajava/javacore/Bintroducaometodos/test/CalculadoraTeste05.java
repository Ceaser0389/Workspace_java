package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {

	public static void main(String[] args) {
		
		
		Calculadora calculadora =  new Calculadora();
		
		int [] numeros = {1,2,3,4,5};
		calculadora.somaArray(numeros);
		
		// aki já passo um array 
		calculadora.somaVarArgs(1,2,3,4,5,6,7);
		
		
		
		
		
	}

}
