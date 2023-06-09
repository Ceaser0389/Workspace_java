package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
		
	System.out.print("Bom ");
	System.out.print("dia!\n\n");	
		
    System.out.println("Boa Tarde");
		
		
	System.out.printf("Megasena : %d %d %d %d %d %d",1,2,3,4,5,6);	
	System.out.printf("Sal�rio: &.1f \n",1234.6789);		
		
	System.out.println("Digite o seu nome:");
	String nome = sc.nextLine();
	
	System.out.println("Digite o seu sobrenome:");
	String sobrenome = sc.nextLine();
	
	System.out.println("Digite o sua idade:");
	 int idade = sc.nextInt();
	
	
	System.out.printf(" %s %s tem %d  anos.%n:",nome,sobrenome,idade);
		
	
		
	 sc.close();	
	}

}
