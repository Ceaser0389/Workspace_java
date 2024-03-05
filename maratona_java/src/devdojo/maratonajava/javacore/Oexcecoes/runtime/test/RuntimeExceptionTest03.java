package devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest03 {

	public static void main(String[] args) {
		
	
		abreConexao();
		System.out.println("-------------------------");
		abreConexao2();
		
	}
	
	private static String abreConexao() {
		
		try {
			
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			return "conexão aberta";
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {               /// sempre é executado
			System.out.println("Fechando recurso liberado pelo $O");
		}
		
		return null;
	}
	
	private static void abreConexao2() {
		
		try {
			
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
	
		} finally {               /// sempre é executado
			System.out.println("Fechando recurso liberado pelo $O");
		}
		
	}
	
}
