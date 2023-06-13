package entities2;

public class Product2 {

	private String name;
	private Double price;
	
	Product2(){
	}

	public Product2(String name, Double price) {
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
	
	//versão com metodo estatico
	public static boolean staticProductPredicate(Product2 p) {
		return p.getPrice() >= 100.0;
	}
	
	//versão com metodo não estatisco
		public  boolean nonStaticProductPredicate() {
			return price >= 100.0;
		}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
