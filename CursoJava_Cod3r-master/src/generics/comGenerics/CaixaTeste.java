package generics.comGenerics;

import java.util.Scanner;

public class CaixaTeste {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Caixa<String> caixaA = new Caixa<>();
	caixaA.aguardar("Segredo!");
	
	String coisaA = caixaA.abrir();
	System.out.println(coisaA);
	
	
	Caixa<Double> caixaB = new Caixa<>();
	caixaB.aguardar(3.1415);
	
	Double coisaB = caixaB.abrir();
	System.out.println(coisaB);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
