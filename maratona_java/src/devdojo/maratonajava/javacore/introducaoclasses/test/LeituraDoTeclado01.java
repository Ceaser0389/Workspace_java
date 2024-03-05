package devdojo.maratonajava.javacore.introducaoclasses.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);

	// next pega só um palavra
	///nextLine lê uma linha toda
	
	 System.out.println("Digite seu nome abaixo:");
	 String nome = sc.nextLine();
	 System.out.println("Digite sua idade");
	 int idade = sc.nextInt();
	 System.out.println("Digite M ou F para seu sexo");
	 char sexo = sc.next().charAt(0);
	 
	 System.out.println("-------------------------------");
	
	 System.out.println("Nome " + nome);
	 System.out.println("Idade " + idade);
	 System.out.println("Sexo " + sexo);
		
	
	 
	
	
	
	
	
	sc.close();	
	}

}
