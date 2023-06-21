package app11;

public class TesteLancamentoExcecao3 {

	
	@SuppressWarnings("unused")
	private static void metodoQuePodeLancarExcecao() {
		RuntimeException zebra = new RuntimeException("Deu Zebra!");
		throw zebra;
	}
	
	
	public static void main(String[] args) {
		metodoQuePodeLancarExcecao();
	}

}
