package controle;


import java.util.Scanner;

public class BreakRotulado {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	
	
	//rotulo
	externo: 
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; i++) {
			if (i == 1) {
				break externo;
			}
			System.out.printf("%d %d",i,j);
		}
		System.out.println();
	}
	System.out.println("Fim!");

	sc.close();
	}

}
