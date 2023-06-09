package POO.desafio_Composicao;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Compra compra1 = new Compra();	
	compra1.adicionarItem("Caneta",2.50, 5);	
	compra1.adicionarItem(new Produto("nootbook",1987.99),2);
		
	Compra compra2 = new Compra();	
	compra2.adicionarItem("Caderno",10.50, 10);	
	compra2.adicionarItem(new Produto("Impressora",998.77),4);	
		
		
	Cliente cliente = new Cliente("Maria Julia Moraes");
	cliente.adicionarCompra(compra1);
	cliente.adicionarCompra(compra2);
		
	System.out.println(cliente.obterValorTotal());	
		
		
	}

}
