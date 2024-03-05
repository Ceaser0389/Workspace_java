package devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
	
	String texto = "Levi,Eren, Mikasa";
	Scanner scanner = new Scanner(texto);
	scanner.useDelimiter(",");	
		
	
	while (scanner.hasNext()) {
		
		if(scanner.hasNext()) {
			int i = scanner.nextInt();
		}else if(scanner.hasNextBoolean()) {
			boolean b = scanner.nextBoolean();
			System.out.println("Boolena"+b);
		}else {
			System.out.println(scanner.next());
		}
	}
		
	
		
		
		
	}

}
