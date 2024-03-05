package devdojo.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTest02 {

     private static List<Car> cars = List.of(
		new Car ("green",2011),
		new Car("black",1998),
		new Car("red",2019));
    
   
     private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
	List<Car> filteredCar = new ArrayList<>();
	for (Car car : cars) {
	   if (carPredicate.test(car)) {
	    filteredCar.add(car);
	}
	    
	}
	return filteredCar;
    }
    
    
    
    public static void main(String[] args) {
	
	
	List<Car> greenCars = filter(cars, new CarPredicate() {
	    

	    public boolean test(Car car) {
		
		return  car.getColor().equals("green");
	    }
	});
	
	System.out.println(greenCars);
    }

}
