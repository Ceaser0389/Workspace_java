package classe;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircTeste {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	AreaCirc a1  = new AreaCirc(10);
	//a.pi =10000;
	
	AreaCirc a2  = new AreaCirc(5);
	//a.pi =0;
	
	//AreaCirc.PI = 3.1415;  //atributo static
	
	System.out.println(a1.area());
	
	System.out.println(a2.area());
	System.out.println(AreaCirc.PI);
	System.out.println(Math.PI);
	
	System.out.println(AreaCirc.area(100));
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
