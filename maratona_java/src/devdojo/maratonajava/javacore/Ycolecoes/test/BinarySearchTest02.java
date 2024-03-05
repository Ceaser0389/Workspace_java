package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class BinarySearchTest02 {
 
	public static void main(String[] args) {
		 MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
		 List<Manga> mangas =  new ArrayList<>(6);	
    	 mangas.add(new Manga(0l,"Attack on Titan",19.9));
    	 mangas.add(new Manga(1l,"Hellsing Ultimatek",21.9));
    	 mangas.add(new Manga(2l,"Attack on Titan",23.9));
    	 mangas.add(new Manga(3l,"Pokemon",25.9));
    	 mangas.add(new Manga(4l,"Dragon ball Z",27.9));
    	
         mangas.sort(mangaByIdComparator);
    	 for (Manga manga : mangas) {
			System.out.println(manga);
		}
    	 
    	 Collections.sort(mangas);
    	 	Manga mangaToSearch	= new Manga(12l,"Dragon ball Z",27.9);
    	 	
    	 System.out.println(Collections.binarySearch(mangas, mangaToSearch,
    	 			mangaByIdComparator));
  }
}
