package devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import devdojo.maratonajava.javacore.ZZClambdas.dominio.*;
import devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

public class MethodReferenceTest01 {

    public static void main(String[] args) {
	
	List<Anime> animeList  =  new ArrayList<>(List.of(new Anime("Berserk",5),
		new Anime("One Piece",900),
		new Anime("Naruto",500)
		));
		
	Collections.sort(animeList, AnimeComparators::compareByTitle);
	Collections.sort(animeList, AnimeComparators::compareByEpisodes);
	
	System.out.println(animeList);
	
	
	
	
	
	

    }

}
