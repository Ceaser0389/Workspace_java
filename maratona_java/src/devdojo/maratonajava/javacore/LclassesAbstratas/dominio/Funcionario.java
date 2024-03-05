package devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

// foi feita p sanar o problema Design código  (abstrata = templete)
  // criada p ser uma super classe
public abstract class Funcionario extends Pessoa {

	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	
	//metodo abstrato só pode em classe abrstrata, já uma classe pode ter ou não um método abstrato
	
	public abstract void calculaBonus();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
