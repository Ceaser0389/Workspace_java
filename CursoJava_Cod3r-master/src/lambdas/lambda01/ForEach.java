package lambdas.lambda01;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
	
	List<String> aprovados = Arrays
				.asList("Ana","Bia","Gui");
		
		
	System.out.println("forma tradicional");
	for (String nome : aprovados) {
		System.out.println(nome);
	}	
		
	System.out.println("\n lambda #01");	
	
	//unico parametrosd n precisa de parenteses
	aprovados.forEach((nome)-> {System.out.println(nome + "!!! ");});	
		
	
	System.out.println("\n method reference #01...");
	aprovados.forEach(System.out::println);	
	
	System.out.println("\n lambda #02");
	aprovados.forEach(nome -> meuImprimir(nome));
	
	
	System.out.println("\n method reference #02...");
	aprovados.forEach(ForEach::meuImprimir);
	

	}
	
	static void meuImprimir(String nome) {
		 System.out.println("Oie ! Meu nome é :"  +nome);
		 
	}

}
