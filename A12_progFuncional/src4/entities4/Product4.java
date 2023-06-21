package entities4;

import Entities.Product;

public class Product4 {

	private String name;
	private Double price;
	
	Product4(){
		
	}

	public Product4(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  name + ", " + String.format("%.2f", price);
	}
	
	
	public static String staticUpperCase(Product4 p) {
		return p.getName().toUpperCase();
	}
	
	public  String nonStaticUpperCase() {
		return name.toUpperCase();
	}
	
	
}
