package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;
	
	// final p constante ...nome da variavel em Maiusculo 
	 //e vc já tem que atrbuir um val
	// static diz que a variavel esta associado  a class n a instancia
	
	public AreaCirc(double raioInicial) {
		this.raio = raioInicial;
	}
	
	
	double area() {
		return PI * Math.pow(raio,2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio,2);
	}
	
	
	
	
}
