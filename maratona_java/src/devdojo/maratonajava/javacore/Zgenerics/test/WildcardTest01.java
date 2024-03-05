package devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
	 public abstract void consulta();
}

class Cachorro extends Animal {

	
	public void consulta() {
		System.out.println("Consultado doguinho");
	}
	
}

class Gato extends Animal {

	
	public void consulta() {
		System.out.println("Consultando Gato");
	}
	
}



public class WildcardTest01 {
	public static void main(String[] args) {
		
		Cachorro[] cachorro =  {new  Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		
		printConsulta(cachorro);
		printConsulta(gatos);
		
		
	}
	
	
	
	
	private static void printConsulta(Animal[] animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
	}
	
	
	
}
