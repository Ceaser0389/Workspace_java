package devdojo.maratonajava.javacore.ZZClambdas.services;

import devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime a1, Anime a2) {
	return a1.getTitle().compareTo(a2.getTitle());
    }
    
    public static int compareByEpisodes(Anime a1, Anime a2) {
  	return  Integer.compare(a1.getepisodes(), a2.getepisodes());
      }
    
    public  int compareByEpisodesNonStatic(Anime a1, Anime a2) {
  	return  Integer.compare(a1.getepisodes(), a2.getepisodes());
      }
}
