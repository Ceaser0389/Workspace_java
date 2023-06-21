package app13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClasseArrayList {

	public static void main(String[] args) {
	
		
	List<String> listaDeNomes = new ArrayList<>();
		
	listaDeNomes.add("Pedro");
	listaDeNomes.add("João");
	listaDeNomes.add("Maria");
	listaDeNomes.add("Kiko");
	
	
	String nomePosicao1 = listaDeNomes.get(1);
	System.out.println("Elemento na posição 1:" + nomePosicao1);
	System.out.println();
		
	for(int i =0; i<listaDeNomes.size(); i++) {
		System.out.println("ListaDeNomes.get(" + i +") = "
	 + listaDeNomes.get(i));
		
	}
	
	boolean encontrouJoao = listaDeNomes.contains("João");
	System.out.println("Encontrou João na lista? " + encontrouJoao);
	
	boolean encontrouRicardo = listaDeNomes.contains("Ricardo");
	System.out.println("E Ricardo? " + encontrouRicardo);
	
	System.out.println("=========================================");
	
	int indiceDaPrimeiraMaria = listaDeNomes.indexOf("Maria");
	System.out.println("Indice da primeira Maria: "
	+ indiceDaPrimeiraMaria);
	
	System.out.println("=========================================");
	
	String nomeAnteriorNaLista = listaDeNomes.set(3, "Cesar");
		System.out.println("Nome que estava na lista: "
	+ nomeAnteriorNaLista);
	
	
	for (String nome : listaDeNomes) {
		System.out.println("Nome: " + nome);
	}
	
	System.out.println("=========================================");
	
	List<String> nomes = new ArrayList<>();
	List<Integer> senhas = new ArrayList<>();
	
	nomes.add("Ricardo");
	senhas.add(new Integer(1010));
	
	
	Iterator<String> iterator = listaDeNomes.iterator();
	
	while (iterator.hasNext()) {
		String nome = iterator.next();
		System.out.println("Nome: " + nome);
	}
	System.out.println("=========================================");
	System.out.println();
	
	ListIterator<String> listIterator =
			listaDeNomes.listIterator(listaDeNomes.size());
	
	while (listIterator.hasPrevious()) {
		String nome = listIterator.previous();
		System.out.println("Nome: " + nome);
	}
	
	System.out.println("=========================================");
	
	
	
	
	}

}
