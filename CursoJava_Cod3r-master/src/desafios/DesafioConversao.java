package desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	
	System.out.println("Informe o Primeiro Salario:");
	String valor1 = sc.next().replace("," , ".");
	System.out.println("Informe o Segundo Salario:");
	String valor2 = sc.next().replace("," , ".");
	System.out.println("Informe o Tercerio Salario:");
	String valor3 = sc.next().replace("," , ".");
	
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);

	
	double media = (salario1 + salario2 + salario2)/3;
	System.out.println("A média dos salários é :" + media );
	
	
	
	sc.close();
	
	
	
	}

}
