package devdojo.maratonajava.javacore.hHeranca.test;

import devdojo.maratonajava.javacore.hHeranca.dominio.Funcionario;

public class Heranca02 {

  // 0 -Bloco inicializacação estático da super classe é executado quando a JVM carregar classe pai
  // 1 -Bloco inicializacação estático da sub classe é executado quando a JVM carregar classe filha
  // 2 -Alocado espaço em memória pra objeto da superclasse
  // 3 -Cada atributo de superclasse é criado e a inicializado com valores default ou o quer for passado da classe 
  // 4 -Bloco de inicialização da superclasse é executado na ordem em que aparece
  // 5 -Construtor é executado da superclasse
  // 6 -Alocado espaço em memória pra objeto da objeto
  // 7 -Cada atributo de subcalsse é criado e inicializado com valores default ou o que for passado
  // 8 -Bloco de inicialização da subclasse é executado na ordem em que aparece
  // 9 -Construtor é executado da superclasse
	
	public static void main(String[] args) {
	
	
	Funcionario funcionario = new Funcionario("Jiraya");
		
	
		
		
		
		
		
		
		
		
	}

}
