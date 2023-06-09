package fundamentos;

public class TipoString {

	public static void main(String[] args) {
	
	//String é um ob imutável	
		
	System.out.println("Olá pessoal".charAt(0));	
		
	
	String s = "Boa Tarde";
	System.out.println(s.concat("!!!"));
	System.out.println(s+ "!!!");	
	System.out.println(s.toLowerCase().startsWith("boa"));	
	System.out.println(s.toUpperCase().endsWith("TARDE!"));
	System.out.println(s.length());
	System.out.println(s.toLowerCase().equals("boa tarde"));	
	System.out.println(s.equalsIgnoreCase("boa tarde"));
		
	var nome = "pedro";
	var sobrenome = "santos";
	var idade = 33;
	var salario = 1245.25;
		
	//printf p formatar
	System.out.printf(" O senhor  %s %s tem %d e ganha R$ %2.f", 
			nome,sobrenome,idade,salario);	
		
	// %s => String
	// %d => inteiro
	// %f => ponto flutuante
	// %c => char
	String frase = String.format(" O senhor  %s %s tem %d e ganha R$ %2.f",
			nome,sobrenome,idade,salario);
	
	System.out.println(frase);
	
	// explore a api da String
	System.out.println("frase qualquer".contains("qual"));
	System.out.println("frase qualquer".indexOf("qual"));
	System.out.println("frase qualquer".substring(6));
	System.out.println("frase qualquer".substring(6,8));//comeca 6 e vai até 8
	
	
	

	}

}
