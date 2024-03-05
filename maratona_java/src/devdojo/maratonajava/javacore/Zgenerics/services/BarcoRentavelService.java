package devdojo.maratonajava.javacore.Zgenerics.services;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;




public class BarcoRentavelService {

	private List<Barco> barcosDisponiveis = new 
			ArrayList<>(List.of(new Barco("lancha"), new Barco("Canoa")));
	
		
	public Barco buscarCarrodisponivel() {
		System.out.println("Buscando barco disponivel");
		Barco barco= barcosDisponiveis.remove(0);
		System.out.println("Alugando barco: " + barco);
		System.out.println("Barcos disponíveis para alugar:");
		System.out.println(barcosDisponiveis);
		return barco;
		
	}
	
	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvendo barco" + barco);
		barcosDisponiveis.add(barco);
		System.out.println("Barcos disponíveis para alugar:");
		System.out.println(barcosDisponiveis);
	}
	
			
}
