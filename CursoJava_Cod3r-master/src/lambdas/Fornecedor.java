package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
	//n recebe nenhum parametro e retorna alguma coisa 
	// supplier é fornecedor    
		// () não tem nenhum par, ou mais de um par 		
		
	Supplier<List<String>> umaLista =
			()-> Arrays.asList("ana","bia","lia","gui");
		
		System.out.println(umaLista.get());
		
		
	}

}
