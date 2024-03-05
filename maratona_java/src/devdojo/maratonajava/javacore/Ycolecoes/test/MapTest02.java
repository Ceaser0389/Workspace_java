package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class MapTest02 {
	public static void main(String[] args) {

		Consumidor consumidor1 = new Consumidor("Willian Suane");
		Consumidor consumidor2 = new Consumidor("Dev");
	
		Manga manga1 = new Manga(5l,"Attack on Titan",19.9);
		Manga manga2 = new Manga(1l,"Hellsing Ultimatek",21.9);
		Manga manga3 = new Manga(4l,"Attack on Titan",23.9);
		Manga manga4 = new Manga(3l,"Pokemon",25.9);
		Manga manga5 = new Manga(2l,"Dragon ball Z",27.9);
	
	
		Map<Consumidor,Manga> consumidorManga =  new HashMap<>();
		consumidorManga.put(consumidor1, manga1);
		consumidorManga.put(consumidor2, manga4);
		
		for(Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		
	
	}
}
