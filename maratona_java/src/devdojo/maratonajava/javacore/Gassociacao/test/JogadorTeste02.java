package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Pelé");
		
		Time time1 = new Time("Corithians");
		
		jogador1.setTime(time1);
		
		jogador1.imprime();
		
	}

}
