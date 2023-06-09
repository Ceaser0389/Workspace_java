package classe;

// dado muito proxio do comportamento falicita , pois as vezes vc não precisa 
// receber por parm

public class Produto {
    
	//atributos
	String nome;
	double preco;
	static double desconto = 0.25;
	
	public Produto() {
	}
	
	//construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	
	// metodo 
	 double precoComDesconto(){
			
		   return  preco * (1- desconto);
		}
		

		//metodo c param
	 double precoComDesconto(double descontoDoGerente){
			
		   return  preco * (1- desconto + descontoDoGerente);
		}
		
	

}
