package devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

	private String nome;
	                        // constante -> final
	public static final double VELOCIDADE_LIMITE = 250;  // deve ter valor inicializado
	
	public final Comprador COMPRADOR = new Comprador();
	
	public final void imprime() {
		System.out.println(this.nome);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
