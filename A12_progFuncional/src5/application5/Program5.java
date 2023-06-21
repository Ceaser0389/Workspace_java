package application5;

import java.util.ArrayList;
import java.util.List;

import entities5.Product5;
import util5.ProductService;

public class Program5 {

	public static void main(String[] args) {
	
	List<Product5> list = new ArrayList<>();
		
	list.add(new Product5("Tv",900.00));
	list.add(new Product5("Mouse",50.00));
	list.add(new Product5("Tablet",350.50));
	list.add(new Product5("HD Case",80.90));

    ProductService ps = new ProductService();
    
    double sum = ps.FilteredSum(list,p -> p.getName().charAt(0) == 'T');
    
    System.out.println("Sum = " + String.format("%.2f", sum));
	
	
	
	
	
	
	}

}
