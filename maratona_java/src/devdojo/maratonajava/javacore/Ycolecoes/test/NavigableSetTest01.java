package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

	
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}

class MangaPrecoComparator implements Comparator<Manga> {

	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}

public class NavigableSetTest01 {
	public static void main(String[] args) {

		NavigableSet<Smartphone> set = new TreeSet<>(
				new SmartphoneMarcaComparator());
		Smartphone smartphone = new Smartphone("123", "Nokia");
		set.add(smartphone);
		System.out.println(set);

		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

		mangas.add(new Manga(5l, "Attack on Titan", 19.9, 12));
		mangas.add(new Manga(7l, "Hellsing Ultimatek", 21.9, 10));
		mangas.add(new Manga(8l, "Attack on Titan", 23.9, 5));
		mangas.add(new Manga(10l, "Pokemon", 25.9, 3));
		mangas.add(new Manga(12l, "Dragon ball Z", 27.9, 3));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Manga yuyu = new Manga(21L, "yuyu Hakusho", 9.5, 5);

		/*
		 * // lower < //floor <= //higher > //ceiling >=
		 */

		System.out.println("----------------");
		System.out.println(mangas.lower(yuyu));
		System.out.println(mangas.floor(yuyu));
		System.out.println(mangas.higher(yuyu));
		System.out.println(mangas.ceiling(yuyu));

		System.out.println(mangas.size());
		System.out.println(mangas.pollFirst());
		System.out.println(mangas.size());

	}
}
