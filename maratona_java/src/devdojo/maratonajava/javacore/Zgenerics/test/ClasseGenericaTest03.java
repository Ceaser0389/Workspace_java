package devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import devdojo.maratonajava.javacore.Zgenerics.services.RentalService;



public class ClasseGenericaTest03 {

	public static void main(String[] args) {
	
	List<Carro> carrosDisponiveis = new ArrayList<>(List.of
			(new Carro("BMW"), new Carro("Fusca")));	
	
	List<Barco> barcosDisponiveis = new ArrayList<>(List.of
			(new Barco("lancha"), new Barco("Canoa")));	
	
	RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
	Carro carro = rentalService.buscarObjetodisponivel();
	rentalService.retornarObjetoAlugado(carro);
		
	System.out.println("----------------------------------------");
	
	RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
	Barco barco = rentalServiceBarco.buscarObjetodisponivel();
	rentalServiceBarco.retornarObjetoAlugado(barco);
	
	
	}

}
