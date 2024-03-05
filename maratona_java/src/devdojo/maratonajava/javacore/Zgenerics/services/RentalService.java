package devdojo.maratonajava.javacore.Zgenerics.services;

import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

public class RentalService<T> {

	private List<T> objetosDisponiveis;
	
	public RentalService(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}
	
	
	public T buscarObjetodisponivel() {
		System.out.println("Buscando carro disponivel");
		T t = objetosDisponiveis.remove(0);
		System.out.println("Alugando : " + t);
		System.out.println(" disponíveis para alugar:");
		System.out.println(objetosDisponiveis);
		return t;
		
	}
	
	public void retornarObjetoAlugado(T t) {
		System.out.println("Devolvendo objeto: " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objetos disponíveis para alugar:");
		System.out.println(objetosDisponiveis);
	}
	
	
	
	
	
	
	
	
	
	
}
