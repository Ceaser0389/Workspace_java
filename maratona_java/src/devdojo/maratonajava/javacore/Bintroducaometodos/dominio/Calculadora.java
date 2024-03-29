package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

	
	public void somaDoisNumeros() {
		
		System.out.println(10 + 10);
	}
	
	public void subtrairDoisNumeros() {
		System.out.println(20 - 2);
	}
	
	public void multiplicaDoisNumeros(int num, int num2) {
		System.out.println(num * num2);
		
	}
	
	public double divideDoisNumeros(double num1, double num2) {
		if(num2 ==0) {
			return 0;
		}
		return num1/num2;
	}
	
	public double divideDoisNumeros2(double num1, double num2) {
		if(num2 !=0) {
			return num1/num2;
		}
		return 0;	
	}
	
	public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("Não existe divisão por zero");
			return;
		}
			System.out.println(num1/num2);
	}
	
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 99;
		num2 = 33;
		System.out.println("Sentro do AlterarDoisNumeros");
		System.out.println("Num1 "+num1);
		System.out.println("Num2 "+num2);
	}
	
	public void somaArray(int[] numeros) {
		int soma =0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	/**
	 *  usando varArgs, só funciona com 1 atributo, ou ele funciona caso
	  ele seja ultimo atributo
	  
	 assim ele aceita ->  public void somaVarArgs(String nome,int... numeros)
	  
	 */
	public void somaVarArgs(int... numeros) {
		int soma =0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	
	}
	
	
	
}
