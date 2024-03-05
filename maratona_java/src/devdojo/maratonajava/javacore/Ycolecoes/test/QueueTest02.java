package devdojo.maratonajava.javacore.Ycolecoes.test;


import java.util.PriorityQueue;
import java.util.Queue;


import devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class QueueTest02 {
 public static void main(String[] args) {
	
	
	Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());
	
	while (!mangas.isEmpty()) {
		System.out.println(mangas.poll());
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}}
