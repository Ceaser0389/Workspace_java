package devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		concatString(1000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");
		
		System.out.println("---------------------------------------------------------");
		
		inicio = System.currentTimeMillis();
		concatString(30_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

		
		System.out.println("---------------------------------------------------------");
		
		inicio = System.currentTimeMillis();
		concatString(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");

	}
	
	
	
	private static void concatString(int tamanho) {
		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			 texto +=i; 
		}
	
	}
	
	@SuppressWarnings("unused")
	private static void concatStringBulider(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {
			 sb.append(i);
		}
	
	}
	
	// mais para ambiente multi-thread
	@SuppressWarnings("unused")
	private static void concatStringBuffer(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {
			 sb.append(i);
		}
	
	}
	
	

}
