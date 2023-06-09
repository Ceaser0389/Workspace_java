package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// System.out.println("2" == "2"); // errado
		
	String s = new String("2");
	System.out.println("2" == s); // errado .. vai dar falso
	System.out.println("2".equals(s));
		
	String s2 = sc.nextLine();
	System.out.println();
	System.out.println("2" == s2.trim());
	System.out.println("2".equals(s2.trim()));
		
	
	sc.close();
	}

}
