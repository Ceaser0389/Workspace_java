package devdojo.maratonajava.javacore.Qstring.test;

public class Stringest01 {

	public static void main(String[] args) {
	
		
	 String nome = "Willian";  // String constant poll, vc nunca altera valor no pool string
	 String nome2 = "Willian";
	 
	 String nome3 = nome.concat("suave");
	 System.out.println(nome == nome2);
	 System.out.println(nome3);
		
	 
	 String nome4 = new String("willian");	 // aki vc está criando uma variavel no heap,
	 // 1 var de ref , 2 obj de String, 3 uma string no pool de string
	 
	 System.out.println(nome4 == nome2);
		
	}
	

}
