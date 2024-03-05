package devdojo.maratonajava.javacore.Dblocosinicializacao.dominio;

public class Anime {

	private String nome;
	private int[] episodios;

	// bloco de inicialização não estatico (exe antes do construtor)  exequando se cria obj
	// 1 alocado espaço em memoria p obj
	// 2 cada atributo de classe e inicializado  com valores default ou quer for passado
	// 3 bloco de inicialização é executado
	// 4 4 Construtor e executado
	{
		System.out.println("Dentro do bloco de inicialização");
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}

	}
	
	public Anime(String nome) {
		this.nome = nome;
	}
	
	public Anime() {
		episodios = new int[100];

		for (int episodio : episodios) {
			System.out.println(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}

}
