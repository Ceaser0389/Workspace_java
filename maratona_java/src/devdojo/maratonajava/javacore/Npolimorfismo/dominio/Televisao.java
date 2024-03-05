package devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao  extends Produto{

	
	public Televisao(String nome, double valor) {
		super(nome, valor);
		
	}
	
	public static final double IMPOSTO_POR_CENT0 = 0.21;
	

	
	public double calcularImposto() {
		System.out.println("Calculando imposto da Televisão");
		return  this.valor * IMPOSTO_POR_CENT0;
	}
	
	

}
