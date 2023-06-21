package app11;

public class EstoqueInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	public EstoqueInsuficienteException(String msg) {
		super(msg);
	}
	
}
