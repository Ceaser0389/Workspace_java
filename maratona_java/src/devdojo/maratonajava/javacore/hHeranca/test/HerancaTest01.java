package devdojo.maratonajava.javacore.hHeranca.test;

import devdojo.maratonajava.javacore.hHeranca.dominio.Endereco;
import devdojo.maratonajava.javacore.hHeranca.dominio.Funcionario;
import devdojo.maratonajava.javacore.hHeranca.dominio.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		
		
	  Endereco endereco = new Endereco();
	  
	  endereco.setRua("Rua 3");
		
	  endereco.setCep("012345-209");
	  
	  Pessoa pessoa = new Pessoa();
	  
	  pessoa.setNome("Toyoshiba Shimazu");
	  
	  pessoa.setEndereco(endereco);
	  
	  pessoa.imprime();
	  
	  
	  Funcionario funcionario = new Funcionario(null);
	  funcionario.setNome("Oda Nobunga");
	  funcionario.setCpf("22222");
	  funcionario.setEndereco(endereco);
	  funcionario.setSalario(20000);
	  
	  System.out.println("----------------------------");
	  funcionario.imprime();
	  

	}

}
