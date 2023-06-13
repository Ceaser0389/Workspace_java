package application3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities3.Product3;


public class Program3 {

	public static void main(String[] args) {
	
		
	 List<Product3> list = new ArrayList<>();
	 
	 list.add(new Product3("Tv",900.0));
	 list.add(new Product3("Mouse",50.0));
	 list.add(new Product3("Tablet",350.50));
	 list.add(new Product3("HD Case",90.90));
	 
	// list.forEach(new PriceUpdate());
	 
	// list.forEach(Product3 :: staticPriceUpdate);
	 
	//list.forEach(Product3 :: nonStaticPriceUpdate);
	
	double factor = 1.1;
	//Consumer<Product3> cons =  p -> {
	//	p.setPrice(p.getPrice() * factor);
	//};
	
	Consumer<Product3> cons = p -> p.setPrice(p.getPrice()* factor);
    list.forEach(cons);
	
	//list.forEach(p -> p.setPrice(p.getPrice()* factor);
	
	list.forEach(System.out::println);
	 
	 
	 

	}

}
