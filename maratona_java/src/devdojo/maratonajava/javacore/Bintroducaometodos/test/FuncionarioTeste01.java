package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {

	public static void main(String[] args) {
		
	 Funcionario funcionario = new Funcionario();	
		
	 funcionario.setNome("Sandi");  
	 funcionario.setIdade(33);
	 
	 
	 funcionario.setSalarios(new double [] {1200,987,32,2000});
		
	
	 funcionario.imprime();
	 
	 
	 
	 
	}

}
