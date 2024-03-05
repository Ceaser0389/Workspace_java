package devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest02 {

	public static void main(String[] args) {
		
			try {
				divisao(1,0);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
	
			System.out.println("Código Finalizado");
	}
	
	
	 private  static int divisao(int a , int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
		}
		return a/b;
	}

}
