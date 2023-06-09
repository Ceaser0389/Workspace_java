package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class ConjuntoComportado {

	public static void main(String[] args) {
		
	Set<String> lista = new HashSet<>();
		lista.add("Ana");
		lista.add("Cesar");
		lista.add("kiko");	
		lista.add("gael");	
		lista.add("leon");
		
		for (String candidato : lista) {
			System.out.println(candidato);
		}	
			
	System.out.println();
	System.out.println("===============================================");
	
	//conjunto ordenado SortedSet
	SortedSet<String> lista2 = new TreeSet<>(); // treeSet garante ordem de inserção
	lista2.add("Obama");
	lista2.add("Gael");
	lista2.add("Leon");	
	lista2.add("Simba");	
	lista2.add("Tigrão");	
	
	
	for (String pets : lista2) {
		System.out.println(pets);
	}	
		
	System.out.println();	
	System.out.println("===============================================");
	
	
	//conjunto de inteiro 
	// aki só aceita tipo obj não primitivo
	SortedSet<Integer> nums = new TreeSet<>(); // treeSet garante ordem de inserção
    nums.add(3);
    nums.add(13);
    nums.add(23);
    nums.add(33);
    nums.add(43);
	
	
	for (int numero : nums) {
		System.out.println(numero);
	}	
	

	}

}
