package desafios;

import java.util.Scanner;

public class DesafioIFELSE {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o nome do dia!");	
	String dia = sc.next();
	
	if("Domingo".equals(dia)) {
		System.out.println(1);
	}
	else if ("Segunda".equals(dia)) {
		System.out.println(2);
	}
	else if ("Terça".equals(dia)) {
		System.out.println(3);
	}
	else if ("Quarta Feira".equals(dia)) {
		System.out.println(4);
	}
	else if ("Quinta Feira".equals(dia)) {
		System.out.println(5);
	}	
	else if ("Sexta Feira".equals(dia)) {
		System.out.println(6);
	}	
	else if ("Sabado".equals(dia)) {
		System.out.println(7);
	}	
	else {
		System.out.println(" dia inválido! ");
	}
	
		
		
	sc.close();
	}

}
