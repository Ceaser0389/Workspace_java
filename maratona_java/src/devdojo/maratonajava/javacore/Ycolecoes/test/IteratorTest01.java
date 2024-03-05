package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class IteratorTest01 {
  public static void main(String[] args) {
	
	 List<Manga> mangas =  new ArrayList<>(6);	
 	 mangas.add(new Manga(5l,"Attack on Titan",19.9,2));
 	 mangas.add(new Manga(7l,"Hellsing Ultimatek",21.9,5));
 	 mangas.add(new Manga(8l,"Attack on Titan",23.9,6));
 	 mangas.add(new Manga(10l,"Pokemon",25.9,7));
 	 mangas.add(new Manga(12l,"Dragon ball Z",27.9,4));
	  
	 Iterator<Manga> mangaIterator = mangas.iterator();
	 
	 while (mangaIterator.hasNext()) {
		Manga manga =  mangaIterator.next();
		if (manga.getQuantidade() == 0) {
			mangaIterator.remove();
		}
	}
	System.out.println(mangas);
	  
	  
	  
	  
	  
	  
	  
  }
}
