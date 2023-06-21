package app9;

public class testeAbstrato {

	public static void main(String[] args) {
		
		
		 Transferencia transf = new Transferencia("Aluguel", 1500,
				 "10/08/2013", "0001000123", "0001000965");
		 
		 transf.emitirComprovante();

	}

}
