package devdojo.maratonajava.javacore.LclassesAbstratas.test;


import devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		
	
	Gerente gerente = new Gerente("kiko",3000);
	
	Desenvolvedor desenvolvedor = new Desenvolvedor("Cesar", 5000);	
		
		
	System.out.println(gerente);
	System.out.println(desenvolvedor);
		

	}

}
