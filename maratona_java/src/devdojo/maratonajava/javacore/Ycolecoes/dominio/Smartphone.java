package devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
	
	private String SerialNumber;
	private String marca;
	
	
	public Smartphone(String serialNumber, String marca) {
		
		SerialNumber = serialNumber;
		this.marca = marca;
	}


	public String getSerialNumber() {
		return SerialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	
	// Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
	// Simétrico: para x e y diferentes de null, se .equals(y) == true logo, y.equals(x) == true
	// Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, 
	// e equals.(z) == true logo, y.equals(z) == true
	// Consistente: x.equals(x) sempre  retorna true se x for difernete de null
	// para x diferente de null, x.equals(null) tem que  retornar false
	@Override
	public boolean equals (Object obj) {
		
		if (obj == null ) return false; 
		if(this == obj)  return true;
		if (this.getClass() != obj.getClass()) return false; 
		Smartphone smartphone = (Smartphone) obj;
		return SerialNumber != null && SerialNumber.equals(smartphone.SerialNumber);
			
	}	
	// se x.equals(y) == true , y.hashCode(x)  == x.hashCode()	
	// y.hashCode() == x.hashCOde() Não necessariamente o equals de y.equals t ser true
	// x.equals(y) == false
	// y.hashCode() != x.hashCOde x.equals(y) deverá ser false
	
	@Override
	 public int hashCode() {
	  return  SerialNumber == null ? 0 : this.SerialNumber.hashCode();
		
	}


	@Override
	public String toString() {
		return "Smartphone [SerialNumber=" + SerialNumber + ", marca=" + marca
				+ "]";
	}
	
	
	

}
