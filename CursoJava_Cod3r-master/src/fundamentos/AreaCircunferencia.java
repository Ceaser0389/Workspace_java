package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		

		
		double raio = 3.4;
		//cria uma constante (const tem ser seu nome em Maiusculo)
		final double PI = 3.1415;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();
	}

}
