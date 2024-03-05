package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {
		
		
		Computador computador = new Computador("NUC1017", 11000);
		Tomate tomate = new Tomate("Tomate Siciliano", 10);
		Televisao tv = new Televisao("Samsung 50\" ",5000);
		
		CalculadoraImposto.CalcularImposto(computador);
		System.out.println("--------------------------------------------");
		CalculadoraImposto.CalcularImposto(tomate);
		System.out.println("--------------------------------------------");
		CalculadoraImposto.CalcularImposto(tv);
		
		
		
		
		
		
		

	}

}
