package devdojo.maratonajava.javacore.Dblocosinicializacao.teste;

import devdojo.maratonajava.javacore.Dblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {

	public static void main(String[] args) {
		
		
		Anime anime = new Anime();
	
		for (int episodio : anime.getEpisodios()) {
			System.out.println(episodio + " ");
		}

		
		
	}

}
