package app12;

public class ClasseString {

	public static void main(String[] args) {
		
		
	String nome = "Pedro";
	System.out.println(nome);
	System.out.println(nome.toUpperCase());
	System.out.println(nome);

	
	String s1 = "Pedro";
	String s2 = "Pedro";
	
	System.out.println("s1.equals(s1)? \n" + (s1.equals(s2)));
	
	String s = "Cursos online";
	
	System.out.println(s.length());
	
	System.out.println("===================================================\n");
	
	char[] array = {'A', 'L', 'G', 'A', 'W', 'O', 'R', 'K', 'S'};
	
	String s3 = new String(array);
	
	System.out.println(s3);
	
	String s4 = "Desenvolvimento Java";
	
	System.out.println(s4.substring(16));
	
	String s5 = "Cursos online de desenvolvimento de software";
	
	System.out.println(s5.substring(7, 12));
	
	String s6 = " AlgaWorks ";
	
	System.out.println("\"" + s6.trim() + "\"");
	
	System.out.println("===================================================\n");
	
	String s7 = "Cursos_online_de_desenvolvimento_de_software";
	
	String [] array1 = s7.split("_");
	
	for (String a : array1) {
			System.out.println(a);
		}
	
	
	System.out.println("===================================================\n");
	
	String s8 = "Java";
	int indice = s8.indexOf('a');
	System.out.println(indice);
	

	System.out.println("===================================================\n");
	
	
	String s9 = "Java";
	int indice1 = s9.lastIndexOf('a');
	System.out.println(indice1);
	
	
	System.out.println("===================================================\n");
	
	String s10  = "Desenvolvimento Java";
	System.out.println(s10.replaceAll("Java", "de software"));
	
	
	
	}

}
