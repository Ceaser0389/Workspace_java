package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
	
	// informa��es do funcionario
		
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 542;
		int id = 56789;
		long pontosAcumulados = 3_435_845_223L; // L pq passa cap do tipo
		
		//java n�o analisa valor , mas sim o tipo 
		
		// tipos numericos reais;
		float salario = 11_445.44F;  // literal float pq passa cap
		double vendasAcumuladas = 2_991_791_103.01;
		
		// tipo boolean 
		 boolean estaDeFerias = false; // true
		
		// tipo caractere , aceita simbolos
		 char  status = 'A'; // Ativo;
		
		 //dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens 
		System.out.println(numerosDeVoo/2);
		
		// pontos por real 
		System.out.println(pontosAcumulados /vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);

		System.out.println("Ferias ? " + estaDeFerias);
		
		System.out.println("Status : " + status);
			
	}

}
