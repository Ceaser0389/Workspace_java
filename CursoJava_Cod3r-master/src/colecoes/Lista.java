package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Cesar"));
		lista.add(new Usuario("Leon"));
		lista.add(new Usuario("Obama"));
		lista.add(new Usuario("Gael"));
		lista.add(new Usuario("Angel"));
		
	//	System.out.println(lista.get(3).nome); // consegue acessar pelo indice
		
		System.out.println(" >>>>>> "+lista.remove(1));
		System.out.println(lista.remove(new Usuario("Angel"))); // aki com obj 
		
		System.out.println("Tem? " + lista.contains(new Usuario("Leon")));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		
		
		
		

	}

}
