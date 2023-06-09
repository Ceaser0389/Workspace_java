package arrays.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantas notas: ");
	int qtdNotas =sc.nextInt();
	
	double[] notas = new double[qtdNotas];
	
	
	for (int i = 0; i < notas.length; i++) {
		System.out.print("Informe a nota:" + i + 1 + ":  ");
		notas[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(notas));
	
	double total =0;
	for (double nota : notas) {
		total += nota;
	}
	
	double media = total / notas.length;
	System.out.println("A média é :" + media + "!");
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
