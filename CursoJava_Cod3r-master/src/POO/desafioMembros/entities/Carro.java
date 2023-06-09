package POO.desafioMembros.entities;

public class Carro {
  
  final  int VELOCIDADE_MAXIMA;
  public int velocidadeAtual;
  public  int delta = 5;
  
  public Carro(int velocidadeMaxima){
	  this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	  
  }
  
  
  
	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;		
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	
}

	@Override
	public String toString() {
		return 
		"Carro "
		+ "[velocidadeAtual=" 
	      + 
		velocidadeAtual + "]";
	}
	
	
	
	
	
	
	
	
	
}
