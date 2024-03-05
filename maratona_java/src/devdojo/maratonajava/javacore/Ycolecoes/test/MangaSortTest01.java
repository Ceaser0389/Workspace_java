package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

class MangaByIdComparator implements Comparator<Manga>{

	public int compare(Manga Manga1, Manga Manga2) {
		return  Manga1.getId().compareTo(Manga2.getId());
	}
	
}

public class MangaSortTest01 {
     public static void main(String[] args) {
		
    	 List<Manga> mangas =  new ArrayList<>(6);	
    	 mangas.add(new Manga(5l,"Attack on Titan",19.9));
    	 mangas.add(new Manga(7l,"Hellsing Ultimatek",21.9));
    	 mangas.add(new Manga(8l,"Attack on Titan",23.9));
    	 mangas.add(new Manga(10l,"Pokemon",25.9));
    	 mangas.add(new Manga(12l,"Dragon ball Z",27.9));
    	
    	 
    	 Collections.sort(mangas);
    	 System.out.println("---------------------------------");
    	 for (Manga manga : mangas) {
			System.out.println(manga);
		}
    	 
    
    	 Collections.sort(mangas, new MangaByIdComparator());
    	 System.out.println("---------------------------------");
    	 for (Manga manga : mangas) {
			System.out.println(manga);
		}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
