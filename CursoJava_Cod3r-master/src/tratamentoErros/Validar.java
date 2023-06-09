package tratamentoErros;

import tratamentoErros.PersonalizadaA.NumeroForaIntervalo;
import tratamentoErros.PersonalizadaA.StringVaziaException;

public class Validar {

	public Validar() {}
	
	
	public static void aluno(Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervalo {
		
		if (aluno ==null) {
			throw new IllegalArgumentException("O aluo está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			 throw new StringVaziaException("Nome");
		}
		if(aluno.nota < 0 || aluno.nota  >10) {
			throw new  NumeroForaIntervalo("Nota");
		}
	}
	
	
	
	
	
}
