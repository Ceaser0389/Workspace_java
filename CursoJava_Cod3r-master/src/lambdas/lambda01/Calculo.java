package lambdas.lambda01;

@FunctionalInterface
public interface Calculo {

	double executar(double a ,double b);
	
	default String legal() {
		return "legal";
	}
	
	
	static String muitoLegal() {
		return "muito legal";
	}
			
}





// @FunctionalInterface força vc ter um unico metodo 
// quanto vc cria uma função labda vc precisa associar com uma interface 
// metodo default executa com a notação   @FunctionalInterface