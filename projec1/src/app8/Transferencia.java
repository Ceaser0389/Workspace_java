package app8;

public class Transferencia  extends Transacao{


	private String contaOrigem;
	private String ContaDestino;
	
	
	public Transferencia(String descricao, double valor, String data,  
			String contaDestino, String contaOrigem) {
		
		super(descricao, valor,data);
		
		this.contaOrigem = contaOrigem;
		this.ContaDestino = contaDestino;
	}
	

	public String getContaOrigem() {
		return contaOrigem;
	}


	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}


	public String getContaDestino() {
		return ContaDestino;
	}


	public void setContaDestino(String contaDestino) {
		ContaDestino = contaDestino;
	}


    @Override
	public void emitirComprovante() {
		System.out.println("Comprovante da transação");
		System.out.println("========================");
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Data: " + this.getData());
		System.out.println("Valor: " + this.getValor());
		
		System.out.println("Conta de origem: "
		+ this.getContaOrigem());
		System.out.println("Conta de destino: "
		+ this.getContaDestino());
		System.out.println();
	}
	
	
	
	
}
