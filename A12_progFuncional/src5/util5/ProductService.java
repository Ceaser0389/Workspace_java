package util5;

import java.util.List;
import java.util.function.Predicate;

import entities5.Product5;

public class ProductService {

	 public double FilteredSum(List<Product5> list, Predicate<Product5> criteria) {
		
		 double sum = 0.0;
		 
		 for (Product5 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		 
		 
		 return sum;
		 
	 }
}
