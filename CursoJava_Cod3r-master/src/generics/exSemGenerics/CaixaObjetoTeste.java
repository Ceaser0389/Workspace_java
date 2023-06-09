package generics.exSemGenerics;

import java.util.Scanner;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	CaixaObjeto caixaA = new CaixaObjeto();
	caixaA.aguardar(2.3); // double -> Double
	
	Double coisa = (Double)  caixaA.abrir(); 
	System.out.println(coisa);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
		
	}

}
