package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
	
    String texto = "";
    
    
    do {
		System.out.println("Vo�e precisa falar" 
        + "as palavras magicas:");
		System.out.println("Quer Sair");
	} while (!texto.equalsIgnoreCase("por favor !"));
    
    System.out.println("Obrigado!");
    
  

	sc.close();

	
		
	}

}
