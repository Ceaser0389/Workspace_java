package devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;
	
	
	public Anime(String nome, String tipo, int episodios, String genero) {
		this(); // ref outro construtor
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}
	
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome,tipo,episodios,genero); // precisa ser a 1 linha exe
		this.estudio = estudio;
	}

	public Anime() {
		System.out.println("Dentro do construtor sem argumentos");
	}





	//sobrecarga de metodos é ter o mesmo nome , mas muda a quantidade ou tipo de parametros
	
	/*
	 * public void init(String nome, String tipo, int episodios) { this.nome = nome;
	 * this.tipo = tipo; this.episodios = episodios;
	 * 
	 * }
	 * 
	 * public void init(String nome, String tipo, int episodios,String genero) {
	 * this.init(nome, tipo, episodios); this.genero = genero;
	 * 
	 * }
	 */
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEstudio() {
		return estudio;
	}


	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	
	
	
	
}
