package classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto("Tv",2500.00); //ini c construtor
		//p1.nome = "Notebook"; // nota��o p acessar os membros da class
		//p1.preco = 1250.00;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.50;
		
		Produto.desconto = 0.29;
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		
		double precoFinal1 = p1.precoComDesconto(); // quando chamo c/parentes � metodo sem atributo
		double precoFinal2 = p2.precoComDesconto(0.25);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Média do  carrinho =R$.2f",mediaCarrinho);
		
		System.out.println();
		
		
		
		
		
		
		
		sc.close();	
	}

}
