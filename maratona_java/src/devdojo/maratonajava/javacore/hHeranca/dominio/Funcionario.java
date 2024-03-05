package devdojo.maratonajava.javacore.hHeranca.dominio;

public class Funcionario extends Pessoa{


	private double salario;
	
	
	static {
		System.out.println("Dentro do bloco estático de pessoa");
	  }
    
		{
		System.out.println("Dentro do bloco inicialização de pessoa 1");
	}
		{
		System.out.println("Dentro do bloco inicialização de pessoa 2");
	  }
	
	
     public Funcionario(String nome) {
    	 super(nome);
    	 System.out.println("Dentro do construtor de funcionário");
     }	

	public Funcionario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
	
	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + 
				"recebi o salário de " + this.salario);
	}
	
	
	
}
