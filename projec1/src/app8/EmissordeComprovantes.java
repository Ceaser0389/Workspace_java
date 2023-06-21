package app8;

public class EmissordeComprovantes {

	public void emitirComprovantes(Transacao ...transacoes) {
		
		for (Transacao transacao : transacoes) {
			transacao.emitirComprovante();
		}
	}
	
}
