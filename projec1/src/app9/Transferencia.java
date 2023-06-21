package app9;

public class Transferencia  extends Transacao{

	private String contaOrigem;
	private String contaDestino;
	
	
	public Transferencia(String descricao, double valor, String data, String
			contaOrigem, String contaDestino) {
		
		super(descricao, valor, data);
		
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
	}


	public String getContaOrigem() {
		return contaOrigem;
	}


	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}


	public String getContaDestino() {
		return contaDestino;
	}


	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}
	
	public void emitirComprovante() {
		
		System.out.println("Comprovante de transferência");
		System.out.println("============================");
		System.out.println("Conta de origem: "
		+ this.getContaOrigem());
		System.out.println("Conta de destino: "
		+ this.getContaDestino());
		System.out.println("----------------------------");
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data da operação: " + this.getData());
		System.out.println();
	}
	
	
}
