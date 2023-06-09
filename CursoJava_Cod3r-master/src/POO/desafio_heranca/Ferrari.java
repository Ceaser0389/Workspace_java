package POO.desafio_heranca;

public class Ferrari extends Carro implements IEsportivo,ILuxo {

	private boolean ligarTurbo;
	private boolean ligarAr;                       
	 
	public Ferrari() {
		super(312);
	}

	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAR() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && !ligarAr) {
			return 30;
		}
		else if (ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	
	}
	
	
/*	@Override   //serve como validação é uma anotation 
	void acelerar() {
		velocidadeAtual += 15;
	}
	*/
	
}
