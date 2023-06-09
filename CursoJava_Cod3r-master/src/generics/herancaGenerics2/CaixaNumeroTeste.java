package generics.herancaGenerics2;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
	
		
	CaixaNumero<Double> caixaA = new CaixaNumero<>();
	caixaA.guardar(23.5);
	System.out.println(caixaA.abrir());	
		
	CaixaNumero<Double> caixaB = new CaixaNumero<>();
	caixaB.guardar(23.5);
	System.out.println(caixaB.abrir());	
			
		
		
		

	}

}
