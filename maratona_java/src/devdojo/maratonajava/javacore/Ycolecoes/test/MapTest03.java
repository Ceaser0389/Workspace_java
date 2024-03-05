package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class MapTest03 {
	public static void main(String[] args) {

		Consumidor consumidor1 = new Consumidor("Willian Suane");
		Consumidor consumidor2 = new Consumidor("Dev");
	
		Manga manga1 = new Manga(5l,"Attack on Titan",19.9);
		Manga manga2 = new Manga(1l,"Hellsing Ultimatek",21.9);
		Manga manga3 = new Manga(4l,"Attack on Titan",23.9);
		Manga manga4 = new Manga(3l,"Pokemon",25.9);
		Manga manga5 = new Manga(2l,"Dragon ball Z",27.9);
	
	
		List<Manga> mangaConsumidor1List = List.of(manga1,manga2,manga3);
		List<Manga> mangaConsumidor2List = List.of(manga3,manga4);
		
		Map<Consumidor,List<Manga>> consumidorMangaMap =  new HashMap<>();
		consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
		
		for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
			System.out.println(entry.getKey().getNome());
			for (Manga manga : entry.getValue()) {
				System.out.println("-------"+manga.getNome());
			}
		}
		
		
	
	}
}
