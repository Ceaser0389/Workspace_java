package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste05 {

	public static void main(String[] args) {

	Estudante estudante01 = new Estudante();
	Estudante estudante02 = new Estudante();
	ImpressoraEstudante impressora = new ImpressoraEstudante();
	
	estudante01.nome = "Midoraya";	
	estudante01.idade = 15;
	estudante01.sexo = 'M';
		
		
	estudante02.nome = "Sakura";	
	estudante02.idade = 16;
	estudante02.sexo = 'F';
	
	impressora.imprime(estudante01);
			
	impressora.imprime(estudante02);
	
	System.out.println("###########################");
	
	impressora.imprime(estudante01);
	
	impressora.imprime(estudante02);
	
	
	}

}
