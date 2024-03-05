package devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate  extends Produto{

    private String dataValidade;
	
	public Tomate(String nome, double valor) {
		super(nome, valor);
		
	}
	
	public static final double IMPOSTO_POR_CENT0 = 0.06;
	
	
	public double calcularImposto() {
		 System.out.println("Calculando imposto do tomate");
		return  this.valor * IMPOSTO_POR_CENT0;
	}

	
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	
	
	
	
	

}
