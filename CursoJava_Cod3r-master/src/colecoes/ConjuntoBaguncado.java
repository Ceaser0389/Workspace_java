package colecoes;

import java.util.HashSet; // Set é um conjunto !
import java.util.Set;



public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		
	 HashSet conjunto = new HashSet();
	 //HashSet n aceita tipos primitivos dai converte os valores

	 //adcionar             //converte primitivo para obj
	  conjunto.add(1.2); // double -> double
	  conjunto.add(true);  // boolean -> boolean
	  conjunto.add("teste"); // String
	  conjunto.add(1);    // // int -> integer
	  conjunto.add('x');
	 
	  System.out.println("Tamanho é:" + conjunto.size());
	 
	  conjunto.add("Teste");
	  conjunto.add('x');
	  System.out.println("Tamanho é:" + conjunto.size());
	 
	  System.out.println(conjunto.remove("Teste"));
	  System.out.println(conjunto.remove("x"));
	 
	  System.out.println("Tamanho é:" + conjunto.size());
	 
	 
	  System.out.println(conjunto.contains('x'));
	  System.out.println(conjunto.contains(1));
	  System.out.println(conjunto.contains(false));
	  
	  Set nums = new HashSet();

	  nums.add(1);
	  nums.add(2);
	  nums.add(3);
	  
	  System.out.println(nums);
	  System.out.println(conjunto);
	  
	  conjunto.addAll(nums);  //união dois conjuntos
	  System.out.println(conjunto);
	  
	  conjunto.retainAll(nums);  // interseção de dois conjuntos
	  System.out.println(conjunto);
	  
	  conjunto.clear();
	  System.out.println(conjunto);
	  
	  
	  
	  
	 
	}

}
