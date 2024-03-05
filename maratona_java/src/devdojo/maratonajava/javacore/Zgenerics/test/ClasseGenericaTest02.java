package devdojo.maratonajava.javacore.Zgenerics.test;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import devdojo.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;

public class ClasseGenericaTest02 {

	public static void main(String[] args) {
	
		
	BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
	Barco barco = barcoRentavelService.buscarCarrodisponivel();
	System.out.println("Usando o barco por um mês...");
	barcoRentavelService.retornarBarcoAlugado(barco);
	
		
	}

}
