package devdojo.maratonajava.javacore.Zgenerics.test;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import devdojo.maratonajava.javacore.Zgenerics.services.CarroRentavelService;

public class ClasseGenericaTest01 {

	public static void main(String[] args) {
	
		
	CarroRentavelService carroRentavelServive = new CarroRentavelService();
	Carro carro = carroRentavelServive.buscarCarrodisponivel();	
	
	System.out.println("Usando o carro por um mês...");
	carroRentavelServive.retornarCarroAlugado(carro);
		
		
	}

}
