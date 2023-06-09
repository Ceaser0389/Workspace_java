package stream.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		
	/*   exercicio 
	 1 - numero para string binaria  .. 6=> "110"
	 2 - Inverter uma String ... "110" => "110"	 
	 3- ocnverter de volta para numero inteiro "110" => 3
	 
	 * Integer
	 */
		
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	UnaryOperator <String> inverter =
			s -> new StringBuilder(s).reverse().toString();
			
	 Function<String,Integer> binarioPInt = 
			 s -> Integer.parseInt(s,2);
	 
	
	nums.stream()
	   .map(Integer::toBinaryString)
	   .map(inverter)
	   .map(binarioPInt)
	   .forEach(System.out::println);
		
		
		
		

	}

}
