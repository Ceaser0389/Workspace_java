package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String faixa = "preta";
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Bassei-Dai...");	
	case "marron":
		System.out.println("Sei o Tekki Shodan...");	
	case "roxa":
		System.out.println("Sei o Heidan Godan...");	
	case "verde":
		System.out.println("Sei o Heidan Yodan...");	
	case "laranja":
		System.out.println("Sei o Heidan Sandan...");	
	case "vermelha":
		System.out.println("Sei o Heidan Nidan...");		
	case "amarela":
		System.out.println("Sei o Heidan Shodan...");			
	default:
		System.out.println("Não sei nada");			
		
	}
	
	sc.close();

	}

}
