package devdojo.maratonajava.javacore.Ycolecoes.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

	public static void main(String[] args) {
		
	 List<String> mangas =  new ArrayList<>(6);	
	 mangas.add("Attack on Titan");
	 mangas.add("Berserk");
	 mangas.add("Hellsing Ultimate");
	 mangas.add("Pokemon");
	 mangas.add("Dragon ball Z");

	 Collections.sort(mangas);
	
	 List<Double> dinheiros = new ArrayList<>();
	 dinheiros.add(100.21);
	 dinheiros.add(23.21);
	 dinheiros.add(21.21);
	 dinheiros.add(98.21);
	 
	 Collections.sort(dinheiros);
	 
	 for (String m : mangas) {
		System.out.println(m);
	}
		
	
	System.out.println(dinheiros);
	Collections.sort(dinheiros);
	System.out.println(dinheiros);
		
		
		
		
	}

}
