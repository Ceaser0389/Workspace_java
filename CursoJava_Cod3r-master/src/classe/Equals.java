package classe;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	Usuario u1 = new Usuario();
	u1.nome = "Pedro Silva";
	u1.email = "pedro.silva@gmail.com";
	
	Usuario u2 = new Usuario();
	u2.nome = "Pedro Silva";
	u2.email = "pedro.silva@gmail.com";
	
	System.out.println(u1 == u2); // comp endereço de memoria
	System.out.println(u1.equals(u2)); ///pq não implementei o equals da falso
	System.out.println(u2.equals(u1));
	
	
	
	
	// hashcode prox aula
	
	
	
	
	
	sc.close();
	
	}

}
