package devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {

	public static void main(String[] args) {
	
		Carro carro = new Carro();
		
		System.out.println(Carro.VELOCIDADE_LIMITE);

		Comprador comprador2 =  new Comprador();
	   //carro.COMPRADOR = new Comprador();
		
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.setNome("Enzo");
		ferrari.imprime();
		
		
		
	}

}
