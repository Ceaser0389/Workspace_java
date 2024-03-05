package devdojo.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

public class ComportamentoPorParametroTest03 {

     private static List<Car> cars = List.of(
		new Car ("green",2011),
		new Car("black",1998),
		new Car("red",2019));
    
   
     private static  <T>List<T	> filter(List<T> list, Predicate<T> predicate){
	List<T> filteredList = new ArrayList<>();
	for ( T e : list) {
	    if ( predicate.test(e)) {
		filteredList.add(e);
	    }
	    
	}
	return filteredList;
    }
    
     public static void main(String[] args) {
	
	 List<Integer>  nums = List.of(1,2,3);
	 System.out.println(filter(nums, num -> num  % 2 == 0));
    }

}
