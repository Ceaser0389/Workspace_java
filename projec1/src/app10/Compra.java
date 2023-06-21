package app10;

public class Compra implements Autorizavel , Imprimivel {

	private String nomeCliente;
	private double valorTotal;
	private String produto;
	
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	@Override
	public double getValorTotal() {
		return 0;
	}


	@Override
	public String getCabecalhoPagina() {
		
		return  this.getProduto() + " = " + this.getValorTotal();
	}


	@Override
	public String getCorpoPagina() {
		
		return this.getNomeCliente();
	}

}
