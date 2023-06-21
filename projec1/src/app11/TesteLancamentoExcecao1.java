package app11;

public class TesteLancamentoExcecao1 {

	public static void main(String[] args) {
		
		try {
			metodoQuePodeLacarExcecao();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
			

	}
	
	@SuppressWarnings("unused")
	private static void metodoQuePodeLacarExcecao() throws Exception{
		Exception zebra = new Exception("Deu Zebra");
		throw zebra;
	}
	

}
