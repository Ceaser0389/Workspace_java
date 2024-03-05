package devdojo.maratonajava.javacore.introducaoclasses.test;
//// importando a classe
import devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class PessoaTest {

	public static void main(String[] args) {
		
	/// inst um obj
	 Estudante estudante = new Estudante();	
	 
	 
	 estudante.nome = "Cesar";
	 estudante.idade = 33;
	 estudante.sexo = 'M';
	 
	 System.out.println(estudante); // imprime a ref do obj
	 
	 
		
		

	}

}
