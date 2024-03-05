package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

	
	//baixo acoplamento o certo usar modificador de acesso privado
	
	private String nome;
	private int idade;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Idade inválida ");
			return;
		}
		this.idade = idade;
	}
	
	
	public int getIdade() {
		return this.idade;
	}
	
	
	
	
	
}
