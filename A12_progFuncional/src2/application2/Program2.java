package application2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities2.Product2;
import util.ProductPredicate;

public class Program2 {

	public static void main(String[] args) {
		
	 List<Product2> list = new ArrayList<>();
	 
	 list.add(new Product2("Tv",900.00));
	 list.add(new Product2("Mouse",50.00));
	 list.add(new Product2("Tablet",350.00));
	 list.add(new Product2("HD Case",80.90));
		
	   // versão 1 com interface
	  /// list.removeIf( new ProductPredicate());
	 
	  // versão 2 com metodo na classe
	  // list.removeIf(Product2 :: staticProductPredicate); // ref p metodo
	 
	  // versão 3  com metodo na classe não estatico
	  //list.removeIf(Product2 :: nonStaticProductPredicate);
	 
	  
	  // versão 4 versão lambda declarada
	   double min = 100.0;
	 	 //Predicate<Product2> pred = p -> p.getPrice() >= min;
	    // list.removeIf(pred);
	     
	  // versão 5 versão lambda inline
	     list.removeIf(p -> p.getPrice() >= min);
	     
	     
	 
	 for (Product2 p : list) {
		System.out.println(p);
	}
	 
	 
	 
	 
	 
	 
	 
	}

}
