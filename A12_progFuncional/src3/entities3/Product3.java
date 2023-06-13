package entities3;

public class Product3 {

	private String name;
	private Double price;
	
	Product3(){
		
	}

	public Product3(String name, Double price) {
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
	
	public static void staticPriceUpdate(Product3 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
	    price = price * 1.1;
	}
	
	
	
}
