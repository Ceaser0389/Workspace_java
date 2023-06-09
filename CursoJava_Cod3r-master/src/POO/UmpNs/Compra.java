package POO.UmpNs;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	///cria o item
	void adicinarItem(String nome, int qtd , double preco) {
		this.adicionarItem(new Item(nome,qtd,preco));
	}

	// add item
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	
	double obterValorTotal() {
		double total =0;
		
		for (Item item : itens) {
			total += item.qtd * item.preco;
		}
		
		return total;
	}
	
	
	
	
	
	
} 
