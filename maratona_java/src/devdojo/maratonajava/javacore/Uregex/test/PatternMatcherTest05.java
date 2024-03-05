package devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

	public static void main(String[] args) {
		
		///  \d = todos os dígitos		 "\\d"
		//   \D = tudo o que n for digito "\\D"
		// \s = todos paços em branco \t \n \f \r
		// \S = todos os caaracteres excluidos os brancos
		// \w = a-ZA-Z, dígitos, _        "\\w"
		// \W = tudo que n for incluso no \w
		// []
		
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
		
		String texto = "luff@hotmail.com, 123jataro@gmail.com,#@!zoro@gmail.com,"
				+ "teste@gmial.com";
		
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		
		System.out.println("texto: "+texto);		
	
		System.out.println("indice: 0123456789");
		System.out.println("regex" +regex);
		System.out.println("Posições encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start()+ " " + matcher.group()+"\n");
		}
		
	
	}

}
