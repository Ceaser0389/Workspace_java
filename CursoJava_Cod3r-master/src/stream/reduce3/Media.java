package stream.reduce3;

public class Media {

	private double total;
	private  int qtd;
	
	public Media adicionar(double valor) {
		 total += valor;
		 qtd++;
		 return this;
	}
	
	public double getValor() {
		return total/qtd;
	}
	
	public static  Media combinar(Media m1, Media m2){
		Media resultante =  new Media();
		resultante.total  = m1.qtd + m2.qtd;
		resultante.qtd  = m1.qtd + m2.qtd;
		
		return resultante;
	}
	
}
