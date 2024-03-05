package devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {

	public static void main(String[] args) {
		
		///  \d = todos os dígitos		 "\\d"
		//   \D = tudo o que n for digito "\\D"
		// \s = todos paços em branco \t \n \f \r
		// \S = todos os caaracteres excluidos os brancos
		// \w = a-ZA-Z, dígitos, _        "\\w"
		// \W = tudo que n for incluso no \w
		// []
		
		// . 1.3
		
	
		String regex = "ab";
		String texto = "12 0x 0x 0xFFABC 0x109 0x1";
		
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto2: "+ texto);		
	
		System.out.println("indice: 0123456789");
		System.out.println("regex" +regex);
		System.out.println("Posições encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start()+ " " + matcher.group()+"\n");
		}
		
	
	}

}
