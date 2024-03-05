package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {

	public static void main(String[] args) {
		
	Calculadora calculadora = new Calculadora();
		
	//tipo primitivo passa um copia para o param do metodo
	 int num1 =1;
	 int num2 = 2;
		
	 // Métodos Parâmetros tipo primitivo
	 
	 calculadora.alteraDoisNumeros(num1, num2);
     System.out.println("Detro da CalculadoraTeste04");
	 System.out.println(num1);
	 System.out.println(num2);
	 
	 
	}

}
