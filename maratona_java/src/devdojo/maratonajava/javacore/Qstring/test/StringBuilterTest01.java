package devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilterTest01 {

	public static void main(String[] args) {
		
		String nome = "Willian Suane";
		nome.concat("DevDojo");
		System.out.println(nome);
	
		StringBuilder sb = new StringBuilder("Willian Suane");
		sb.append("DevDojo").append("Academy");
		System.out.println(sb);
		sb.reverse();
		sb.reverse();
		sb.delete(0, 3);
		sb.substring(2, 3);
		System.out.println(sb);
		
	}

}
