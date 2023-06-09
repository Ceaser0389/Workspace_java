package lambdas.Predicate;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
	
	//recebe um tipo e retorna o mesmo tipo 
	BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) /2;		
	System.out.println(media.apply(9.8, 5.7));	
		
	// recebe dois tipos e tem retorno
	BiFunction<Double, Double, String> resultado =(n1,n2) ->{
		double notaFinal = (n1+n2)/2;
		return notaFinal  >= 7 ? "Aprovado" : "Reprovado";
	};	
	System.out.println(resultado.apply(9.7, 7.1));
	System.out.println(resultado.apply(5.1, 4.3));
	
		
	Function<Double,String>	conceito =
	m -> m >=7 ? "Aprovado":"Reprovado";
		
	//composição de funçoes
	System.out.println(media.andThen(conceito).apply(9.7,4.5));
		
		

	}

}
