package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		//pessoa.nome = "Jiraya";
		//pessoa.idade = 70;
		
		pessoa.setNome("Jiraya");  // altera , atribui valor
		pessoa.setIdade(70);
		
		System.out.println(pessoa.getNome());    // pegar
		System.out.println(pessoa.getIdade());
		
		
		
	}

}
