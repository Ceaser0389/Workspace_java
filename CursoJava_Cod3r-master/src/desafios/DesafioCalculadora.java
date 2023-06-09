package desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// ler num1
		// ler num2
		// + - * / %
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		double num1 = sc.nextDouble();
		
		System.out.println("Informe outro numero:");
		double num2 = sc.nextDouble();
		
		System.out.println("Informe a operação:");
		String op =sc.nextLine();
		
		//Lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 + num2 : resultado;
		resultado = "*".equals(op) ? num1 + num2 : resultado;
		resultado = "/".equals(op) ? num1 + num2 : resultado;
		resultado = "%".equals(op) ? num1 + num2 : resultado;
		
		System.out.printf("%.2f %s  %.2f = %.2f", 
		num1, op,num2,resultado);
		
		sc.close();
	}

}
