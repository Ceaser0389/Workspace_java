package devdojo.maratonajava.javacore.introducaoclasses.test;

import devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
	 Carro c1 = new Carro();
	 Carro c2 = new Carro();
	 
	 c1.nome = "Fiat";
	 c1.modelo = "Uno";
	 c1.ano = 1998;
	 
	 c2.nome = "Ford";
	 c2.modelo = "Fiesta";
	 c2.ano = 2004;
		
	
	 System.out.println("Nome: " + c1.nome + " modelo: " + c1.modelo +
	 " ano: " + c1.ano);
	
	 System.out.println("Nome: " + c2.nome + " modelo: " + c2.modelo +
			 " ano: " + c2.ano);
	 
	
	 c1 = c2;
	 
	 System.out.println("Nome: " + c1.nome + " modelo: " + c1.modelo +
			 " ano: " + c1.ano);
	 
	 
	 
	 
	 
	 
	 
	}

}
