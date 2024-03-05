package devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Carro {

	private String nome;
	private double velocidadeMaxima;
	public static double VelocidadeLimite = 250; // independente do obj, ou seja da instancia
	// pertence a classe em si
	// atributo pertence a classe
	
	public Carro() {}
	
	public Carro(String nome, double velocidadeMaxima ) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
		

	public void imprime() {
		System.out.println("----------------");
		System.out.println("Nome" + this.nome);
		System.out.println("Velocidade Maxíma" + this.velocidadeMaxima);
		System.out.println("velocidade Limite" + Carro.VelocidadeLimite);
	}
	
	/*
	 * Um metodo static não sabe tem a possibilidade de não ter obj em memoria,
	 * quando os metodos não acessam uma variavel(atributo) instancia
	 * 
	 * 
	 * 
	 */
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.VelocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite() {
		return VelocidadeLimite;
	
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
