package classe;

import java.util.Locale;
import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	Data d1 = new Data();
	d1.ano = 2021;
	
	var d2 = new Data(31,12,2020);
	
	
	String dataFormatada = d1.obterDataFormatada();
	
	System.out.println(dataFormatada);
	System.out.printf("%d %d %d \n",d2.dia,d2.mes,d2.ano);
	
	d1.imprimirDataFormatada();
	d2.imprimirDataFormatada();
	
	
	
	// valores padrão dos tipos primitivos
	// byte, short, long , int -> 0;
	// float , double -> 0.0;
	// boolean => false;
	// char  => '/u000';
	
	// objetos p padrão recebe null ..ou seja não aponta p nenhum local de memoria
	//String s = null;
	
	// variavel local tem que ser inicializadas;;;;;
	
	
	sc.close();
	}

}
