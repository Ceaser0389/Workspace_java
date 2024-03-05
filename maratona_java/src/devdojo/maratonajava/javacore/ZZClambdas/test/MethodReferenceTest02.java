package devdojo.maratonajava.javacore.ZZClambdas.test;


import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest02 {

    public static void main(String[] args) {
	
	AnimeComparators animeComparators = new AnimeComparators();
	
	List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk",5)));
	
	animeList.sort(animeComparators:: compareByEpisodesNonStatic);
	animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
	
	
	

    }

}
