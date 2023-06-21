package app11;

public class Produto {

	private int estoque;

	public Produto(int estoque) {
		super();
		this.estoque = estoque;
	}
	
	public void baixarEstoque(int quantidade)  throws
	EstoqueInsuficienteException{
		if ( quantidade > this.estoque) {
			throw new EstoqueInsuficienteException("Estoque" 
				+"insuficiente" + "Estoque Atual:"
				+ this.estoque);
		}
		this.estoque -= quantidade;
	}
	
	
}
