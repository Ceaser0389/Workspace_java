package POO.desafioMembros.entities;

public class Ferrari extends Carro {

	
	
	public Ferrari(){
		super(312);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
   
	
/*	@Override   //serve como validação é uma anotation 
	void acelerar() {
		velocidadeAtual += 15;
	}
	*/
	
}
