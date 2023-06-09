package arrays;

import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double[] notas = {9.9, 8.6,7.2,9.4};
	
	for (int i = 0; i < notas.length; i++) {
		System.out.println(notas[i]);
	}
	
	
	//foreach apelido+nomeColecao
	for (double nota : notas) {
		System.out.println(nota);
	}

			
	sc.close();
	}

}
