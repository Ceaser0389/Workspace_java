package devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest04 {

    public static void main(String[] args) {
	
	Supplier<AnimeComparators> newAnimeComparators = AnimeComparators:: new;
        AnimeComparators animeComparators = newAnimeComparators.get();  
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk",43)));
	
        
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
        
        BiFunction<String, Integer, Anime> animeFunction = (title,episodes) ->
        new Anime("", 0);
        
        BiFunction<String, Integer, Anime> animeFunction2 = Anime::new;
        System.out.println(animeFunction2.apply("Super campeões", 36));
        
    }
}
