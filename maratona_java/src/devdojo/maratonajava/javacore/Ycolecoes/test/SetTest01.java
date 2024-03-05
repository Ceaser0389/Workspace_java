package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class SetTest01 {
   public static void main(String[] args) {
	
	   
	 Set<Manga> mangas = new HashSet<>();
	  
	 mangas.add(new Manga(0l,"Attack on Titan",19.9));
  	 mangas.add(new Manga(1l,"Hellsing Ultimatek",21.9));
  	 mangas.add(new Manga(2l,"Attack on Titan",23.9));
  	 mangas.add(new Manga(3l,"Pokemon",25.9));
  	 mangas.add(new Manga(4l,"Dragon ball Z",27.9)); 
	   
	 for (Manga manga : mangas) {
		System.out.println(manga);
	} 
	   
	   
	   
   }
}
