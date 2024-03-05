package devdojo.maratonajava.javacore.Zgenerics.services;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;



public class CarroRentavelService {

	private List<Carro> carrosDisponiveis = new 
			ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
	
		
	public Carro buscarCarrodisponivel() {
		System.out.println("Buscando carro disponivel");
		Carro carro = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: " + carro);
		System.out.println("Carros disponíveis para alugar:");
		System.out.println(carrosDisponiveis);
		return carro;
		
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo carro" + carro);
		carrosDisponiveis.add(carro);
		System.out.println("Carros disponíveis para alugar:");
		System.out.println(carrosDisponiveis);
	}
	
			
}
