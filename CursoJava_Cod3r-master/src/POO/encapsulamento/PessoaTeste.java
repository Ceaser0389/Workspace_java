package POO.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
	Pessoa p1 = new Pessoa("Cesar",30);	
	p1.setIdade(32); // alterar valor da variavel 
	
	System.out.println(p1.getIdade());	// ler 
	System.out.println(p1);	// chama toString
		
		
		
	}

}
