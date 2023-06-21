package app8;

public class TesteTransacao {

	public static void main(String[] args) {
		
		
		
		Transacao transferencia = new Transferencia("Aluguel", 1500,
				 "10/08/2013", "0001000123", "0001000965");
		 
		PagamentoBoleto pagtoBoleto = new PagamentoBoleto("Condomínio", 450,
				"26/08/2013", "1234 1234 1234", "27/08/2013",
				"Edifício da Praça Redonda");
	  
		EmissordeComprovantes emissor = new EmissordeComprovantes();
		emissor.emitirComprovantes(transferencia,pagtoBoleto);
		
		
		//exemplo com casting
	///	Transacao transacao = new Transferencia("Aluguel", 1500, "10/08/2013",
		//		"0001000123", "0001000965");
				// compila, mas experimente rodar (hehehe)
		///PagamentoBoleto pagtoBoleto = (PagamentoBoleto) transacao;
		
		Object obj = new Transferencia("Aluguel", 1500, "10/08/2013",
				"0001000123", "0001000965");
				
		if (obj instanceof PagamentoBoleto) {
			PagamentoBoleto pagtoBoleto1 = (PagamentoBoleto) obj;
			System.out.println(pagtoBoleto.getLinhaDigitavel());
				} 
		else if (obj instanceof Transacao) {
			Transacao transacao = (Transacao) obj;
			System.out.println(transacao.getDescricao());
				}
		
		

	}

}
