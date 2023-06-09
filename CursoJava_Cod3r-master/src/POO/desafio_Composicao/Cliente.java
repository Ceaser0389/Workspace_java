package POO.desafio_Composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	//um cliente faz varias compras
	final List<Compra> compras = new ArrayList<>();
	
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	
	
	
	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		return  total;
	}
	
	
	
	
}
