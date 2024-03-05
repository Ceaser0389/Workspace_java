package devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

	public Computador(String nome, double valor) {
		super(nome, valor);
		
	}
	
	public static final double IMPOSTO_POR_CENT0 = 0.21;
	

	public double calcularImposto() {
		 System.out.println("Calculando imposto do computador" );
		return  this.valor * IMPOSTO_POR_CENT0;
	}
	
	
	
	
	

}
