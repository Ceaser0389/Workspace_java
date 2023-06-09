package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double[] notasAlunoA = new double[3];	
	System.out.println(Arrays.toString(notasAlunoA));	
	
	notasAlunoA[0] =  7.9;
	notasAlunoA[1] =  8;
	notasAlunoA[2] =  6.7;
	
	//// class arrays.toString imprime formatado vetor
	System.out.println(Arrays.toString(notasAlunoA));	
	System.out.println(notasAlunoA[0]);	//le o elemento
	System.out.println(notasAlunoA[notasAlunoA.length -1]); // pega ultima nota do array
	
	
	// percorrer o array
	double totalAlunoA =0;
	for (int i = 0; i < notasAlunoA.length; i++) {
		totalAlunoA += notasAlunoA[i];
	}
		
	System.out.println(totalAlunoA /3);	
		
	final double notaArmazenada =5.9;
	double[] notasAlunoB = {6.9,8.9,notaArmazenada,10};	
	double totalAlunoB =0;	
	for (int i = 0; i < notasAlunoB.length; i++) {
		totalAlunoB += notasAlunoB[i];
	}	
		

	sc.close();

	}

}
