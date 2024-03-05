package devdojo.maratonajava.javacore.Npolimorfismo.servico;


import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;



// classe de serviço apra regras de negócio
public class CalculadoraImposto {

	
	
	public static void CalcularImposto(Produto produto) {
		
		System.out.println("Relatório de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		
		// se instacia de produto for tomate
		if (produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getDataValidade());
		}
		
		
	}
	
	
	
	
	
	
}
