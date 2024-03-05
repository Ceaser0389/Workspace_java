package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();  
		List<String> nomes2 = new ArrayList<>();  
		
		nomes.add("gael");
		nomes.add("DevDojo");
		nomes.add("Cesa");
		
		nomes2.add("Obama");
		nomes2.add("Theo");
		nomes.add("Minguau");
		
		
		//nomes.remove("gaal");
		nomes.addAll(nomes2);
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.add("Suane");
		System.out.println("---------------------------");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	
		
		
		// n add dados no for
		// na List vc tem usar os tipos Wrapper, n primitivos
		
	}

}
