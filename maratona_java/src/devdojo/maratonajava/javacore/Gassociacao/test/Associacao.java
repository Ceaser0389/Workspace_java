package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class Associacao {

	public static void main(String[] args) {
		
		Local local = new Local("Rua das Laranjeiras");
		
		Aluno aluno = new Aluno("Luffy",17);
		
		Professor professor = new Professor("Barba Branca","Pirata");
		
		Aluno[] alunosParaSeminario = {aluno};
		
		Seminario seminario = new Seminario("Onde achar one 		piece",alunosParaSeminario,local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
		
		
		

	}

}
