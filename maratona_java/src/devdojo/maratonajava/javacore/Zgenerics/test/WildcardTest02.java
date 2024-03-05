package devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WildcardTest02 {
	public static void main(String[] args) {
		
		List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
		List<Gato> gato = List.of(new Gato(),new Gato());
		printConsulta(gato);
		printConsulta(cachorros);
		
		List<Animal> animals = new ArrayList<>();
	}
	
	
	
	
	@SuppressWarnings("unused")
	private static void printConsulta(List<? extends Animal> animals) {
		
		for (Animal animal : animals) {
			animal.consulta();
		}
		
	}
	
	private static void printConsultaAnimal(List<? super Animal> animals) {
		animals.add(new Cachorro());
		animals.add(new Gato());
	}
	
}
