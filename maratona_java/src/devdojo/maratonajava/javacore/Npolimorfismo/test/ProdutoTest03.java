package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

	public static void main(String[] args) {
		
		// tipo gerenrico fazendo ref p um tipo mais especifico
		
		Produto produto1 = new Computador("Ryzen 9", 3000);
		
        Tomate tomate =  new Tomate("Americano",20);
		tomate.setDataValidade("11/12/2021");
		
		
		CalculadoraImposto.CalcularImposto(tomate);
	}

}
